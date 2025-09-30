package Level2_3_Tasca_S1_04;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class IdenticalArrayTest {

    @Test
    public void arraysAreIdenticalTest(){
       int[] first = {1,2,3,4,5};
       int[] second = {1,2,3,4,5};


       assertThat(second).isEqualTo(first);
    }


    @Test
    public void arraysAreNotIdenticatTest(){
        int[] first = {1,2,3,4,5,6};
        int[] second = {1,2,3,4};

        assertThat(second).isNotEqualTo(first);
    }
}
