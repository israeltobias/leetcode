package org.leetcode.isomorphicstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    @Test
    void case1(){
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        String s ="egg";
        String t ="add";
        boolean res = isomorphicStrings.isIsomorphic(s, t);
        assertTrue(res);
    }
    @Test
    void case2(){
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        String s ="foo";
        String t ="bar";
        boolean res = isomorphicStrings.isIsomorphic(s, t);
        assertFalse(res);
    }
    @Test
    void case3(){
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        String s ="paper";
        String t ="title";
        boolean res = isomorphicStrings.isIsomorphic(s, t);
        assertTrue(res);
    }

}