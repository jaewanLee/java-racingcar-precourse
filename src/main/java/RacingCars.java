import java.util.ArrayList;
import java.util.List;

public class RacingCars {
    private ArrayList<Car> cars=new ArrayList<>();

    RacingCars(String[] names) {
        for (String name : names) {
            cars.add(new Car(name));
        }
    }


}
