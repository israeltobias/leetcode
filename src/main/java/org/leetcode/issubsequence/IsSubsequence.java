package org.leetcode.issubsequence;
/**
 * @author israel
 * Daily problem leetcode 2023-09-22
 * https://leetcode.com/problems/is-subsequence/?envType=daily-question&envId=2023-09-22
 */
public class IsSubsequence {
    /*public boolean isSubsequence(String s, String t) {
        int length = 0, index = 0;
        char[] seq = new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            char a = s.charAt(i);
            for (int j = 0; j < t.length(); j++) {
                char b = t.charAt(j);
                if(a == b){
                    length++;
                    seq[index] = b;
                    index++;
                    break;
                }
            }
        }
        String res = new String(seq);
        return s.equals(res);
    }*/
    public boolean isSubsequence(String s, String t) {
        int sIdx = 0;
        int tIdx = 0;

        while (sIdx < s.length() && tIdx < t.length()) {
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                sIdx++;
            }
            tIdx++;
        }

        return sIdx == s.length();
    }
}
