package org.leetcode.maxk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxKTest {

    @Test
    void case1(){
        MaxK maxK = new MaxK();
        int[] nums = {-1,2,-3,3};
        int response = maxK.findMaxK(nums);
        assertEquals(3, response);
    }
    @Test
    void case2(){
        MaxK maxK = new MaxK();
        int[] nums = {-1,10,6,7,-7,1};
        int response = maxK.findMaxK(nums);
        assertEquals(7, response);
    }
    @Test
    void case3(){
        MaxK maxK = new MaxK();
        int[] nums = {-10,8,6,7,-2,-3};
        int response = maxK.findMaxK(nums);
        assertEquals(-1, response);
    }

    @Test
    void case4(){
        MaxK maxK = new MaxK();
        int[] nums = {-1,2,-3,3};
        int response = maxK.findMaxK2(nums);
        assertEquals(3, response);
    }
    @Test
    void case5(){
        MaxK maxK = new MaxK();
        int[] nums = {-1,10,6,7,-7,1};
        int response = maxK.findMaxK2(nums);
        assertEquals(7, response);
    }
    @Test
    void case6(){
        MaxK maxK = new MaxK();
        int[] nums = {-10,8,6,7,-2,-3};
        int response = maxK.findMaxK2(nums);
        assertEquals(-1, response);
    }
}