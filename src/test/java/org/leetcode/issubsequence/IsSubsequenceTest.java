package org.leetcode.issubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    @Test
    void test1(){
        String s = "abc";
        String t = "ahbgdc";
        IsSubsequence isSubsequence = new IsSubsequence();
        boolean res = isSubsequence.isSubsequence(s,t);
        assertEquals(true,res);
    }

    @Test
    void test2(){
        String s = "axc";
        String t = "ahbgdc";
        IsSubsequence isSubsequence = new IsSubsequence();
        boolean res = isSubsequence.isSubsequence(s,t);
        assertEquals(false,res);
    }

    @Test
    void test3(){
        String s = "acb";
        String t = "ahbgdc";
        IsSubsequence isSubsequence = new IsSubsequence();
        boolean res = isSubsequence.isSubsequence(s,t);
        assertEquals(false,res);
    }
}