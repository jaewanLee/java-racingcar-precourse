import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class NumberUtilsTest {
    @Test
    void getRandom() {
        assertThat(NumberUtils.getRandom()).isLessThan(10);
        assertThat(NumberUtils.getRandom()).isGreaterThan(-1);

    }
}