package Level2_Tasca_S1_04;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IntegerAssertionTest {

    @Test
    public void testIntegerEquality(){
        Integer a = 10;
        Integer b = 10;

        assertThat(a).isEqualTo(b);
    }


    @Test
    public void testIntegerInequality(){
        Integer a = 10;
        Integer b = 20;

        assertThat(a).isNotEqualTo(b);
    }


}
