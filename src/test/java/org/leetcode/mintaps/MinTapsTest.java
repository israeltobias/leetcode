package org.leetcode.mintaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinTapsTest {

    @Test
    void minTaps(){
        int n = 5;
        int[] ranges = {3,4,1,1,0,0};
        MinTaps minTaps = new MinTaps();
        int res = minTaps.minTaps(n,ranges);
        int myRes = minTaps.myMinTaps(n,ranges);
        assertEquals(1,res);
        assertEquals(1,myRes);
    }
    @Test
    void minTaps1(){
        int n = 5;
        int[] ranges = {0,0,0,0};
        MinTaps minTaps = new MinTaps();
        int res = minTaps.minTaps(n,ranges);
        int myRes = minTaps.myMinTaps(n,ranges);
        assertEquals(-1,res);
        assertEquals(-1,myRes);
    }
    @Test
    void minTaps2(){
        int n = 7;
        int[] ranges = {1,2,1,0,2,1,0,1};
        MinTaps minTaps = new MinTaps();
        int res = minTaps.minTaps(n,ranges);
        int myRes = minTaps.myMinTaps(n,ranges);
        assertEquals(3,res);
        assertEquals(3,myRes);
    }
}