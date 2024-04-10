package org.leetcode.removeduplicateletters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateLettersTest {

    @Test
    void test1(){
        String s ="bcabc";
        RemoveDuplicateLetters rdl = new RemoveDuplicateLetters();
        String response = rdl.removeDuplicateLetters(s);
        assertEquals("abc",response);
    }

    @Test
    void test2(){
        String s ="cbacdcbc";
        RemoveDuplicateLetters rdl = new RemoveDuplicateLetters();
        String response = rdl.removeDuplicateLetters(s);
        assertEquals("acdb",response);
    }


}