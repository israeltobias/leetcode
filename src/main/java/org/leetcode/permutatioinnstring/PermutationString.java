package org.leetcode.permutatioinnstring;

public class PermutationString {
    public PermutationString() {
        super();
    }
    public boolean checkInclusion(String s1, String s2) {
        int lengthS1 = s1.length();
        int lengthS2 = s2.length();
        if(lengthS1 > lengthS2) return false;
        if (s1.equals(s2)) return true;
    return true;
    }

}
