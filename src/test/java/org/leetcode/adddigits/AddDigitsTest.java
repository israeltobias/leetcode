package org.leetcode.adddigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDigitsTest {

    @Test
    public void addDigts () {
        AddDigits addDigits = new AddDigits();
        int sum = addDigits.addDigits(38);
        int sum1 = addDigits.addDigits(0);
        assertEquals(2, sum);
        assertEquals(0,sum1);
    }
    @Test
    public void addDigtsNine () {
        AddDigits addDigits = new AddDigits();
        int sum = addDigits.addDigtsNine(38);
        int sum1 = addDigits.addDigtsNine(0);
        assertEquals(2, sum);
        assertEquals(0,sum1);
    }
}