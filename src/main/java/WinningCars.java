import java.util.ArrayList;
import java.util.List;

public class WinningCars {
    private List<Car> winningCars = new ArrayList<>();

    public void addCars(Car car) {
        this.winningCars.add(car);
    }

    public void clear() {
        this.winningCars.clear();
    }

    public String winningMessage() {
        String[] carNames = new String[this.winningCars.size()];
        for (int i = 0; i < this.winningCars.size(); i++) {
            carNames[i] = this.winningCars.get(i).getName();
        }
        return String.join(",", carNames) + "가 최종 우승했습니다";
    }
}
