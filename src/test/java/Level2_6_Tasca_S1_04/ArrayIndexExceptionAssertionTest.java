package Level2_6_Tasca_S1_04;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

public class ArrayIndexExceptionAssertionTest {

    @Test
    public void throwException(){
        int[] numbers = {1,2,3,4,5};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int index = numbers[5];} , "Expected ArrayIndexOutOfBoundsException when accessing out-of-bounds index ");




    }






}
