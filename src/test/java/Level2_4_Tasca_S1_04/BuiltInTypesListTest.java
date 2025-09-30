package Level2_4_Tasca_S1_04;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

public class BuiltInTypesListTest {
    public void testArrayListAssertionsWithBuiltInTypes() {
        String name = "Youssef";
        Integer age = 25;
        Double height = 1.75;
        Boolean active = true;
        String city = "Barcelona";
        String country = "Spain";


        List<Object> data = new ArrayList<>();
        data.add(name);
        data.add(age);
        data.add(height);
        data.add(active);
        data.add(city);

        assertThat(data).containsExactly(name, age, height, active, city);


        assertThat(data).containsExactlyInAnyOrder(height, name, city, age, active);


        assertThat(data).filteredOn(e -> e.equals("Alice")).hasSize(1);


        assertThat(data).doesNotContain(country);
    }
}


