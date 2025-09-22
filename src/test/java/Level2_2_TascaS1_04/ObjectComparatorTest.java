package Level2_2_TascaS1_04;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class ObjectComparatorTest {

     //Same reference

    @Test
    public void testSameReference(){
        Object obj1 = new Object();
        Object obj2 = obj1;
        assertSame(obj1, obj2, "Expected that objects are same reference.");
    }



    @Test
    public void testNotSameReference(){
        Object obj1 = new Object();
        Object obj3 = new Object();
        assertNotSame(obj1, obj3, "Expected that objects are not same reference.");
    }

}
