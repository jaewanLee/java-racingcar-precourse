import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
class NumberTest {

    @Test
    void getValue() {
        Number number=new Number(5);
        assertThat(number.getValue()).isEqualTo(5);
    }
}