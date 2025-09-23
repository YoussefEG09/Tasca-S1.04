package Level1_2_Tasca_S1_04;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class DNICalculatorTest {

    static Stream<Arguments> dniDataProvider() {
        return Stream.of(
                Arguments.of(12345678, 'Z'),
                Arguments.of(87654321, 'X'),
                Arguments.of(11111111, 'H'),
                Arguments.of(22222222, 'J'),
                Arguments.of(33333333, 'P'),
                Arguments.of(44444444, 'A'),
                Arguments.of(55555555, 'K'),
                Arguments.of(66666666, 'Q'),
                Arguments.of(77777777, 'B'),
                Arguments.of(88888888, 'Y')
        );

    }


    @Test
    public void invalidDniTest() {
        DNICalculator calculator = new DNICalculator();

        assertThrows(IllegalArgumentException.class, () ->
                calculator.calculateLetter(-1));

        assertThrows(IllegalArgumentException.class, () ->
                calculator.calculateLetter(100000000));
    }


    @ParameterizedTest
    @MethodSource("dniDataProvider")
    public void calculateLetterTest(int dni, char expectedLetter) {

        DNICalculator calculator = new DNICalculator();
        char letter = calculator.calculateLetter(dni);
        assertEquals(expectedLetter, letter);

    }
}
