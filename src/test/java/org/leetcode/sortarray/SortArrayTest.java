package org.leetcode.sortarray;

import org.junit.jupiter.api.Test;
import org.leetcode.sortcolors.SortColors;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {
    @Test
    void case1(){
        int[] nums = {5,2,3,1};
        int[] expected = {1,2,3,5};
        SortArray sortArray = new SortArray();
        sortArray.sortArray(nums);
        assertArrayEquals(expected,nums);
    }
    @Test
    void case2(){
        int[] nums = {5,1,1,2,0,0};
        int[] expected = {0,0,1,1,2,5};
        SortArray sortArray = new SortArray();
        sortArray.sortArray(nums);
        assertArrayEquals(expected,nums);
    }
}