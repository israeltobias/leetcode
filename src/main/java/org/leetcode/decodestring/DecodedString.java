package org.leetcode.decodestring;
/**
 * @author israel
 * Daily problem leetcode 2023-09-27
 * https://leetcode.com/problems/decoded-string-at-index/?envType=daily-question&envId=2023-09-27
 */
public class DecodedString {
    /* Error: Java heap space
    public String decodeAtIndex(String s, int k) {
        StringBuilder decoded= new StringBuilder();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int times=Integer.parseInt(String.valueOf(ch)) -1;
                String actual = decoded.toString();
                for (int j = 0; j < times; j++) {
                    decoded.append(actual);
                }
            } else {
                decoded.append(ch);
            }
        }
        String res = String.valueOf(decoded.charAt(k-1));
        return res;
    }*/
    public String decodeAtIndex(String s, int k) {
        long size = 0;
        int n = s.length();

        // Calculate the size of the decoded string
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                size *= s.charAt(i) - '0';
            } else {
                size++;
            }
        }

        // Start decoding from the end of the string
        for (int i = n - 1; i >= 0; i--) {
            k = (int)(k % size);
            char ch = s.charAt(i);
            if (k == 0 && Character.isLetter(ch)) {
                return String.valueOf(ch);
            }

            if (Character.isDigit(ch)) {
                size /= s.charAt(i) - '0';
            } else {
                size--;
            }
        }

        return "";
    }
}
