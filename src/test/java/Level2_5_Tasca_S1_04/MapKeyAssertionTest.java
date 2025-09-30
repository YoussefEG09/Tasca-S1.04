package Level2_5_Tasca_S1_04;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MapKeyAssertionTest {

    @Test
    public void testMapContainsKey() {

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Youssef", 50);
        scores.put("Brian", 80);


        assertThat(scores).containsKey("Brian");
    }
}
