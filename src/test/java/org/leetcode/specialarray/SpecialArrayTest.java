package org.leetcode.specialarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialArrayTest {

    @Test
    void case1() {
        int[] nums = {3,5};
        int expected = 2;
        SpecialArray specialArray = new SpecialArray();
        int response = specialArray.specialArray(nums);
        assertEquals(expected,response);
    }

    @Test
    void case2() {
        int[] nums = {0,0};
        int expected = -1;
        SpecialArray specialArray = new SpecialArray();
        int response = specialArray.specialArray(nums);
        assertEquals(expected,response);
    }

    @Test
    void case3() {
        int[] nums = {0,4,3,0,4};
        int expected = 3;
        SpecialArray specialArray = new SpecialArray();
        int response = specialArray.specialArray(nums);
        assertEquals(expected,response);
    }
}