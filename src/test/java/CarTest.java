import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void constructorValidation(){
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            Car car=new Car("longName");
        }).withMessage("자동차 이름은 5글자 이하만 가능합니다.");
    }

    @Test
    void goAhead() {
        Car car=new Car("test");
        for(int i=0;i<10;i++){
            car.goAhead();
        }
        assertThat(car.getMoving()).isGreaterThan(0);
    }

    @Test
    void getMoving() {
        Car car=new Car("test");
        assertThat(car.getMoving()).isEqualTo(0);
    }

    @Test
    void getName() {
        Car car=new Car("test");
        assertThat(car.getName()).isEqualTo("test");
    }

    @Test
    void printMoving() {
        Car car=new Car("test");
        for(int i=0;i<10;i++){
            car.goAhead();
        }
        assertThat(car.printMoving().contains("-")).isEqualTo(true);
    }
}