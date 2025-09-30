package Level2_7_Tasca_S1_04;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Optional;


public class OptionalTest {
    @Test
    public void emptyOptionalTest(){
        Optional<String> emptyOptional = Optional.empty();

        assertThat(emptyOptional).isEmpty();
    }
}
