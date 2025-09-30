package Level2_6_Tasca_S1_04;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArrayIndexOutOfBoundsExceptionTest {

    @Test
    public void testArrayIndexOutOfBoundsException() {
        int[] numbers = {1,2,3};

        assertThatThrownBy(() -> {
            int invalid = numbers[5];
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class)
                .hasMessageContaining("5");

    }

}
