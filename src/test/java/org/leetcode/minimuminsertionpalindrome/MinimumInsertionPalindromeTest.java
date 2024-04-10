package org.leetcode.minimuminsertionpalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumInsertionPalindromeTest {

    @Test
    void minimumSteps () {
        MinimumInsertionPalindrome mip = new MinimumInsertionPalindrome();

        String param1 = "zzazz";
        int res1 = mip.minInsertions(param1);

        assertEquals(res1,0);

        String param2 = "mbadm";
        int res2 = mip.minInsertions(param2);

        assertEquals(res2,2);

        String param3 = "leetcode";
        int res3 = mip.minInsertions(param3);

        assertEquals(res3,5);

    }

}