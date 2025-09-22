package Level1_2_Tasca_S1_04;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class DNICalculatorTest {
    @ParameterizedTest
    @CsvSource({
            "12345678 , Z",
            "11111111 , H",
            "22222222 , X",
            "33333333 , P",
            "44444444 , J",
            "55555555 , K",
            "66666666 , E",
            "77777777 , L",
            "88888888, R",
            "99999999, R"

    })

    public void invalidDni(){
        DNICalculator calulator = new DNICalculator();
        assertThrows(IllegalArgumentException.class, () ->
                calulator.calculateLetter(-1));

        assertThrows(IllegalArgumentException.class, () ->
                calulator.calculateLetter(100000000));
    }


    public void calculateLetter(int dni, char expectedLetter){

        DNICalculator calculator = new DNICalculator();
        char letter = calculator.calculateLetter(dni);
        assertEquals(expectedLetter, letter);

    }
}
