import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RacingCarsTest {

    @Test()
    void constructValidation() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            new RacingCars(new String[]{"test"});
        }).withMessage("경주할 자동차 2대 이상의 이름을 ','로 구분하여 입력해주세요.");
    }

    @Test
    void racing() {
        RacingCars racingCars = new RacingCars(new String[]{"test1", "test2"});
        assertThat(racingCars.racing(5).contains("우승했습니다")).isEqualTo(true);
    }
}