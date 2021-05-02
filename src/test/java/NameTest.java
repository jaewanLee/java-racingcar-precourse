import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test
    void getName() {
        assertThat(new Name("test").getName()).isEqualTo("test");
    }
}