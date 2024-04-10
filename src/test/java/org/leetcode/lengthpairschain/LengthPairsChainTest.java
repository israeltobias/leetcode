package org.leetcode.lengthpairschain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthPairsChainTest {

    @Test
    void pairs(){
        int[][] pairs = {{1,2},{2,3},{3,4}};
        LengthPairsChain lengthPairsChain = new LengthPairsChain();
        int response =lengthPairsChain.findLongestChain(pairs);
        assertEquals(2,response);
    }
    @Test
    void pairs2(){
        int[][] pairs = {{1,2},{7,8},{4,5}};
        LengthPairsChain lengthPairsChain = new LengthPairsChain();
        int response =lengthPairsChain.findLongestChain(pairs);
        assertEquals(3,response);
    }
    @Test
    void pairs3(){
        int[][] pairs = {{3,4},{2,3},{1,2}};
        LengthPairsChain lengthPairsChain = new LengthPairsChain();
        int response =lengthPairsChain.findLongestChain(pairs);
        assertEquals(2,response);
    }
}