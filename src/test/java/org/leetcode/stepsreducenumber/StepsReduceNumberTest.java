package org.leetcode.stepsreducenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StepsReduceNumberTest {

    @Test
    void case1 () {
        String number = "1101";
        StepsReduceNumber stepsReduceNumber = new StepsReduceNumber();
        int response = stepsReduceNumber.numSteps(number);
        assertEquals(6,response);
    }
    @Test
    void case2 () {
        String number = "10";
        StepsReduceNumber stepsReduceNumber = new StepsReduceNumber();
        int response = stepsReduceNumber.numSteps(number);
        assertEquals(1,response);
    }
    @Test
    void case3 () {
        String number = "1";
        StepsReduceNumber stepsReduceNumber = new StepsReduceNumber();
        int response = stepsReduceNumber.numSteps(number);
        assertEquals(0,response);
    }
    @Test
    void case4 () {
        String number = "1111011110000011100000110001011011110010111001010111110001";
        StepsReduceNumber stepsReduceNumber = new StepsReduceNumber();
        int response = stepsReduceNumber.numSteps(number);
        assertEquals(85,response);
    }


}