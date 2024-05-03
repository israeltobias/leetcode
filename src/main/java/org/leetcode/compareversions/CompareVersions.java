package org.leetcode.compareversions;
/**
 * @author israel
 * Daily problem leetcode 2024-05-03
 * <a href="https://leetcode.com/problems/compare-version-numbers/description/?envType=daily-question&envId=2024-05-03">...</a>
 */
public class CompareVersions {
    public int compareVersion(String version1, String version2) {
        String[] split1 = version1.split("\\.");
        String[] split2 = version2.split("\\.");
        int min = Math.max(split1.length, split2.length);
        for (int i = 0; i < min; i++) {
            int num1 = i< split1.length ? Integer.parseInt(split1[i]) : 0;
            int num2 = i< split2.length ? Integer.parseInt(split2[i]) : 0;
            if(num1 > num2) return 1;
            if(num1 < num2) return -1;
        }
        return 0;
    }
}
