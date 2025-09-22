package Level2_Tasca_S1_04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IntegerTest {

    @Test
    public void testIntegerAreEqual(){
        Integer a = 10;
        Integer b = 10;

        assertEquals(a,b, "Expected that numbers are equal");
    }

    @Test
    public void testIntegerAreNotEqual(){
        Integer a = 10;
        Integer b = 20;

        assertNotEquals(a,b , "Expected that numbers are not equal");
    }
}
