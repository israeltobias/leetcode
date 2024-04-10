package org.leetcode.lengthlastword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthlastWordTest {

    @Test
    void case1(){
        String s = "Hello World";
        LengthlastWord lengthlastWord = new LengthlastWord();
        int res = lengthlastWord.lengthOfLastWord(s);
        assertEquals(5,res);
    }
    @Test
    void case2(){
        String s = "   fly me   to   the moon  ";
        LengthlastWord lengthlastWord = new LengthlastWord();
        int res = lengthlastWord.lengthOfLastWord(s);
        assertEquals(4,res);
    }

    @Test
    void case3(){
        String s = "luffy is still joyboy";
        LengthlastWord lengthlastWord = new LengthlastWord();
        int res = lengthlastWord.lengthOfLastWord(s);
        assertEquals(6,res);
    }

    @Test
    void case4(){
        String s = "Hello World";
        LengthlastWord lengthlastWord = new LengthlastWord();
        int res = lengthlastWord.lengthOfLastWord2(s);
        assertEquals(5,res);
    }
    @Test
    void case5(){
        String s = "   fly me   to   the moon  ";
        LengthlastWord lengthlastWord = new LengthlastWord();
        int res = lengthlastWord.lengthOfLastWord2(s);
        assertEquals(4,res);
    }

    @Test
    void case6(){
        String s = "luffy is still joyboy";
        LengthlastWord lengthlastWord = new LengthlastWord();
        int res = lengthlastWord.lengthOfLastWord2(s);
        assertEquals(6,res);
    }
    @Test
    void case7(){
        String s = "a";
        LengthlastWord lengthlastWord = new LengthlastWord();
        int res = lengthlastWord.lengthOfLastWord2(s);
        assertEquals(1,res);
    }
}