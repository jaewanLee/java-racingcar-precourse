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


}
