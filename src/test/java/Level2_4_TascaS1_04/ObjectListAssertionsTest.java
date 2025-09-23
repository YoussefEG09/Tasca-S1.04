package Level2_4_TascaS1_04;

import org.junit.jupiter.api.Test;

import java.util.*;

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
        Set<Object> expected = new HashSet<>(Arrays.asList(obj3, obj2, obj1));
        Set<Object> actual = new HashSet<>(testList);

        assertEquals(expected, actual, "Sets should be equal regardless of order or duplicates.");

    }

    @Test
    public void only1InArray() {
        long count = testList.stream().filter(o -> Objects.equals(o, obj2)).count();
        assertEquals(1, count, "Object should appear 1 time in the list.");

    }


    @Test
    public void objectNotInList() {
        char obj4 = 'Z';
        assertFalse(testList.contains(obj4), "List should not contain object  number 4 (Char 'Z')");
    }


}
