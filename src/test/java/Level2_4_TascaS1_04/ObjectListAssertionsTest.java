package Level2_4_TascaS1_04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;


public class ObjectListAssertionsTest {

    private final int obj1 = 25;
    private final String obj2 = "Youssef";
    private final double obj3 = 74.5;

    private final ArrayList<Object> testList = new ArrayList<>(Arrays.asList(obj1, obj2, obj3));

    @Test
    public void arrayOrder() {
        ArrayList<Object> expected = new ArrayList<>(Arrays.asList(obj1, obj2, obj3));
        assertEquals(expected, testList, "Expected objects in the same order");
    }


    @Test
    public void arrayInAnyOrder() {
        assertTrue(testList.contains(obj1), "List contains object number 1.");
        assertTrue(testList.contains(obj2), "List contains object number 2.");
        assertTrue(testList.contains(obj3), "List contains object number 3.");

    }

    @Test
    public void only1InArray(){

    }


    @Test
    public void objectNotInList(){
        char obj4 = 'Z';
        assertFalse(testList.contains(obj4), "List should not contains object  number 4 (Char 'Z')");
    }


}
