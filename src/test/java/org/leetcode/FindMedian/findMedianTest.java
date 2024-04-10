package org.leetcode.FindMedian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findMedianTest {

    @Test
    public void test1() {
        FindMedian findMedian = new FindMedian();
        int[] a = {1,3};
        int[] b = {2};
        double res = findMedian.findMedianSortedArrays(a,b);
        assertEquals(2.000,res);
    }

    @Test
    public void test2() {
        FindMedian findMedian = new FindMedian();
        int[] a = {1,2};
        int[] b = {3,4};
        double res = findMedian.findMedianSortedArrays(a,b);
        assertEquals(2.500,res);
    }
    @Test
    public void test3() {
        FindMedian findMedian = new FindMedian();
        int[] a = {};
        int[] b = {1};
        double res = findMedian.findMedianSortedArrays(a,b);
        assertEquals(1,res);
    }
    @Test
    public void test4() {
        FindMedian findMedian = new FindMedian();
        int[] a = {};
        int[] b = {2,3};
        double res = findMedian.findMedianSortedArrays(a,b);
        assertEquals(2.500,res);
    }
}