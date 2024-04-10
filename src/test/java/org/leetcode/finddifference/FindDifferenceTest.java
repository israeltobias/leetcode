package org.leetcode.finddifference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDifferenceTest {

    @Test
    void test1(){
        String s = "abcd";
        String t = "abcde";
        FindDifference findDifference = new FindDifference();
        char res = findDifference.findTheDifference(s,t);
        assertEquals('e',res);
    }
    @Test
    void test2(){
        String s = "a";
        String t = "aa";
        FindDifference findDifference = new FindDifference();
        char res = findDifference.findTheDifference(s,t);
        assertEquals('a',res);
    }

    @Test
    void test1Bit(){
        String s = "abcd";
        String t = "abcde";
        FindDifference findDifference = new FindDifference();
        char res = findDifference.findTheDifferenceBit(s,t);
        assertEquals('e',res);
    }
    @Test
    void test2Bit(){
        String s = "a";
        String t = "aa";
        FindDifference findDifference = new FindDifference();
        char res = findDifference.findTheDifferenceBit(s,t);
        assertEquals('a',res);
    }
}