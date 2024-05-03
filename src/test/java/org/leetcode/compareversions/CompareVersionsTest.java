package org.leetcode.compareversions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareVersionsTest {

    @Test
    void case1(){
       String version1 = "1.01", version2 = "1.001";
       CompareVersions compareVersions = new CompareVersions();
       int res = compareVersions.compareVersion(version1,version2);
       assertEquals(0,res);
    }

    @Test
    void case2(){
        String version1 = "1.0", version2 = "1.0.0";
        CompareVersions compareVersions = new CompareVersions();
        int res = compareVersions.compareVersion(version1,version2);
        assertEquals(0,res);
    }
    @Test
    void case3(){
        String version1 = "0.1", version2 = "1.1";
        CompareVersions compareVersions = new CompareVersions();
        int res = compareVersions.compareVersion(version1,version2);
        assertEquals(-1,res);
    }
    @Test
    void case4(){
        String version1 = "1.0.1", version2 = "1";
        CompareVersions compareVersions = new CompareVersions();
        int res = compareVersions.compareVersion(version1,version2);
        assertEquals(1,res);
    }
}