package org.leetcode.ispalindrome;

public class IsPalindrome {
    public IsPalindrome() {
        super();
    }

    public boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        char[] palind = new char[chars.length];
        int size = chars.length;
        for (int i = 0; i < size / 2 +1; i++) {
            palind[i] = chars[size - i -1];
            palind[size - i -1] = chars[i];
        }
       // return x == Integer.parseInt(String.valueOf(palind));
        return String.valueOf(x).equals(String.valueOf(palind));
    }

    public boolean isPalindromeWithoutConvertString (int x) {
        int original = x;
        int rev = 0;
        while(x>0){
            rev = x%10 + rev*10;
            x= x/10;
        }
        return rev==original;
    }
}
