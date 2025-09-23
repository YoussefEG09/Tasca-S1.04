package Level1_3_Tasca_S1_04;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionDemoTest {

        @Test
        public void throwExceptionTest(){
                ExceptionDemo instance = new ExceptionDemo();
            assertThrows(ArrayIndexOutOfBoundsException.class, instance::throwException);
        }
}
