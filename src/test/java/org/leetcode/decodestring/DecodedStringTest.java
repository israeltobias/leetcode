package org.leetcode.decodestring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodedStringTest {

    @Test
    void test1(){
        DecodedString decodedString = new DecodedString();
        String s ="leet2code3";
        int k = 10;
        String res =decodedString.decodeAtIndex(s,k);
        assertEquals("o",res);
    }
    @Test
    void test2(){
        DecodedString decodedString = new DecodedString();
        String s ="ha22";
        int k = 5;
        String res =decodedString.decodeAtIndex(s,k);
        assertEquals("h",res);
    }
    @Test
    void test3(){
        DecodedString decodedString = new DecodedString();
        String s ="a2345678999999999999999";
        int k = 1;
        String res =decodedString.decodeAtIndex(s,k);
        assertEquals("a",res);
    }
}