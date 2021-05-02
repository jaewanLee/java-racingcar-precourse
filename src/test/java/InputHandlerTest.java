import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InputHandlerTest {

    @Test
    void parsingName() {
        assertThat(InputHandler.parsingName("test1,test2")).isEqualTo(new String[]{"test1","test2"});
    }
}