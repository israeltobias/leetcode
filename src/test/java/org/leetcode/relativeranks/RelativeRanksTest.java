package org.leetcode.relativeranks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelativeRanksTest {

    @Test
    void case1() {
        RelativeRanks relativeRanks = new RelativeRanks();
        int[] score = {5,4,3,2,1};
        String[] expected = {"Gold Medal","Silver Medal","Bronze Medal","4","5"};
        String[] response = relativeRanks.findRelativeRanks(score);
        assertArrayEquals(expected,response);
    }
    @Test
    void case2() {
        RelativeRanks relativeRanks = new RelativeRanks();
        int[] score = {10,3,8,9,4};
        String[] expected = {"Gold Medal","5","Bronze Medal","Silver Medal","4"};
        String[] response = relativeRanks.findRelativeRanks(score);
        assertArrayEquals(expected,response);
    }
}