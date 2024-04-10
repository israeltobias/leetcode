package org.leetcode.mergeStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsTest {

    @Test
    void mergedString () {
        MergeStrings ms = new MergeStrings();
        String word1T1 = "abc";
        String word2T1 = "pqr";
        String res1 = ms.mergeAlternately(word1T1,word2T1);
        String word1T2 = "ab";
        String word2T2 = "pqrs";
        String res2 = ms.mergeAlternately(word1T2,word2T2);
        String word1T3 = "abcd";
        String word2T3 = "pq";
        String res3 = ms.mergeAlternately(word1T3,word2T3);
        assertEquals(res1,"apbqcr");
        assertEquals(res2,"apbqrs");
        assertEquals(res3,"apbqcd");
    }
}