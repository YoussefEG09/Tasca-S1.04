package Level2_3_TascaS1_04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayAssertionsTest {

    @Test
    public void testArrayAreIdentical (){
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};

        assertArrayEquals(array1, array2 , "Expected that array are identical");
    }
}
