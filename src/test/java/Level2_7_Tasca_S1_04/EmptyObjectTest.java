package Level2_7_Tasca_S1_04;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class EmptyObjectTest {

    Optional<Object> optional = Optional.empty();


    @Test
    public void emptyObjectVerification(){
        assertTrue(optional.isEmpty(), "The object should be empty.");
    }


}
