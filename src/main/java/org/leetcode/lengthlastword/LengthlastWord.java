package org.leetcode.lengthlastword;
/**
 * @author israel
 * Daily problem leetcode 2024-04-01
 * <a href="https://leetcode.com/problems/length-of-last-word/description/?envType=daily-question&envId=2024-04-01">...</a>
 */
public class LengthlastWord {
    public int lengthOfLastWord(String s) {
        String trim = s.trim();
        String[] parts = trim.split(" ");
        return parts[parts.length-1].length();
    }
    public int lengthOfLastWord2(String s) {
        String trim = s.trim();
        int count = 0;
        for (int i = trim.length() -1; i >= 0; i--) {
            if(trim.charAt(i) != ' ') {
                count++;
            } else{
                break;
            }
        }
        return count;
    }
}
