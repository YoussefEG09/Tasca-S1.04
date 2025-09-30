package Level2_2_Tasca_S1_04;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ObjectReferenceTest {


    @Test
    public void sameReferenceTest() {
        String original = "Youssef";
        String second = original;

        assertThat(second).isSameAs(original);
    }


    @Test
    public void differentReferenceTest() {
        String first = "Youssef";
        String second = "Youssef";

        assertThat(second).isNotSameAs(first);
    }


}
