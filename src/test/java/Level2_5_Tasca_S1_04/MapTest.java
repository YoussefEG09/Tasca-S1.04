package Level2_5_Tasca_S1_04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

public class MapTest {

    HashMap<String, Integer> map;

    @BeforeEach
    public void setUp() {
        map = new HashMap<>();
    }

    @Test
    public void verificationKeys() {
        map.put("Youssef", 25);
        assertTrue(map.containsKey("Youssef"), "Map should contain the key 'Youssef'");

    }


}
