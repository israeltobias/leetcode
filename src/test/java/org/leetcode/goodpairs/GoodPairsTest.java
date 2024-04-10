package org.leetcode.goodpairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodPairsTest {

    @Test
    void test1(){
        int[] nums = {1,2,3,1,1,3};
        GoodPairs goodPairs = new GoodPairs();
        int resp = goodPairs.numIdenticalPairs(nums);
        assertEquals(4,resp);
    }
    @Test
    void test2(){
        int[] nums = {1,1,1,1};
        GoodPairs goodPairs = new GoodPairs();
        int resp = goodPairs.numIdenticalPairs(nums);
        assertEquals(6,resp);
    }

    @Test
    void test3(){
        int[] nums = {1,2,3};
        GoodPairs goodPairs = new GoodPairs();
        int resp = goodPairs.numIdenticalPairs(nums);
        assertEquals(0,resp);
    }
}