import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WinningCarsTest {

    @Test
    void addCars() {
        WinningCars winningCars=new WinningCars();
        winningCars.addCars(new Car("audi"));
        assertThat(winningCars.winningMessage().contains("audi")).isTrue();
    }

    @Test
    void clear() {
        WinningCars winningCars=new WinningCars();
        winningCars.addCars(new Car("audi"));
        winningCars.clear();
        winningCars.addCars(new Car("lexus"));
        assertThat(winningCars.winningMessage().contains("audi")).isFalse();
    }

    @Test
    void winningMessage() {
        WinningCars winningCars=new WinningCars();
        winningCars.addCars(new Car("audi"));
        assertThat(winningCars.winningMessage().contains("우승했습니다")).isTrue();
    }
}