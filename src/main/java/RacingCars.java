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


    private void doRacing() {
        for (Car car : this.cars) {
            car.goAhead();
            System.out.println(car.printMoving());
        }
        System.out.println("");
    }
    
}
