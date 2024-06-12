package org.leetcode.sortcolors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColorsTest {

    @Test
    void case1(){
        int[] nums = {2,0,2,1,1,0};
        int[] expected = {0,0,1,1,2,2};
        SortColors sortColors = new SortColors();
        sortColors.sortColors(nums);
        assertArrayEquals(expected,nums);
    }
    @Test
    void case2(){
        int[] nums = {2,0,1};
        int[] expected = {0,1,2};
        SortColors sortColors = new SortColors();
        sortColors.sortColors(nums);
        assertArrayEquals(expected,nums);
    }
    @Test
    void case3(){
        int[] nums = {2,0,2,1,1,0};
        int[] expected = {0,0,1,1,2,2};
        SortColors sortColors = new SortColors();
        sortColors.sortColors1(nums);
        assertArrayEquals(expected,nums);
    }
    @Test
    void case4(){
        int[] nums = {2,0,1};
        int[] expected = {0,1,2};
        SortColors sortColors = new SortColors();
        sortColors.sortColors1(nums);
        assertArrayEquals(expected,nums);
    }
}