import java.util.ArrayList;
import java.util.List;

public class RacingCars {
    private ArrayList<Car> cars=new ArrayList<>();

    RacingCars(String[] names) {
        if (names.length < 2) {
            throw new IllegalArgumentException("경주할 자동차 2대 이상의 이름을 ','로 구분하여 입력해주세요.");
        }
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public String racing(int count) {
        for (int i = 0; i < count; i++) {
            this.doRacing();
        }
        int maxMoving = 0;
        WinningCars winningCars = new WinningCars();
        for (int i = 0; i < this.cars.size(); i++) {
            maxMoving = this.isWinner(maxMoving, winningCars, this.cars.get(i));
        }
        return winningCars.winningMessage();
    }

    private void doRacing() {
        for (Car car : this.cars) {
            car.goAhead();
            System.out.println(car.printMoving());
        }
        System.out.println("");
    }

    private int isWinner(int maxMoving, WinningCars winningCars, Car car) {
        if (maxMoving < car.getMoving()) {
            maxMoving = car.getMoving();
            winningCars.clear();
            winningCars.addCars(car);
            return maxMoving;
        }
        if (maxMoving == car.getMoving())
            winningCars.addCars(car);
        return maxMoving;
    }
}
