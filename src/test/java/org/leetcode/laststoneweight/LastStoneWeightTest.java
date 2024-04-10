package org.leetcode.laststoneweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightTest {

    @Test
    void lastStoneWeight (){
        LastStoneWeight lsw = new LastStoneWeight();
        int[] stones = {2,7,4,1,8,1};
        int winner = lsw.lastStoneWeight(stones);
        int[] stones1 = {1};
        int winner1 = lsw.lastStoneWeight(stones1);
        assertEquals(winner,1);
        assertEquals(winner1,1);
    }
}