package org.leetcode.monotonicarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonotonicArrayTest {

    @Test
    void test1 (){
        int[] nums = {1,2,2,3};
        MonotonicArray monotonicArray = new MonotonicArray();
        boolean res =monotonicArray.isMonotonic(nums);
        assertEquals(true,res);
    }
    @Test
    void test2 (){
        int[] nums = {6,5,4,4};
        MonotonicArray monotonicArray = new MonotonicArray();
        boolean res =monotonicArray.isMonotonic(nums);
        assertEquals(true,res);
    }
    @Test
    void test3 (){
        int[] nums = {1,3,2};
        MonotonicArray monotonicArray = new MonotonicArray();
        boolean res =monotonicArray.isMonotonic(nums);
        assertEquals(false,res);
    }
}