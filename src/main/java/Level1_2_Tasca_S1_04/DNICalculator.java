package Level1_2_Tasca_S1_04;

import java.util.ArrayList;
import java.util.List;

public class DNICalculator {


    public char calculateLetter(int dni){
        char[] alphabet = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};


        // Setting a if conditional to search the letter that corresponds to dni number
        if (dni < 0 || dni > 99999999){
            throw new IllegalArgumentException("DNI number is not valid.");
        }
            int i = dni % 23;
            return alphabet[i];
    }
}
