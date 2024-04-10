package org.leetcode.adddigits;
/**
 * @author israel
 * Daily problem leetcode 2023-04-26
 * https://leetcode.com/problems/add-digits/description/
 */
public class AddDigits {
    public int addDigits(int num) {
        int sum = 0;
        do {
            int quotient = num / 10;
            int rest = num % 10;
            sum = quotient + rest;
            num = sum;
        } while (num >=10);
        return sum;
    }
    public int addDigtsNine (int num){
        if(num==0) return 0;
        else if(num % 9 == 0) return 9;
        else return num % 9;
        // num == 0 ? 0 : 1 +(num +1 )% 9)
    }
}
