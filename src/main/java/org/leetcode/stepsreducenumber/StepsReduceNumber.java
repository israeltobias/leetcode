package org.leetcode.stepsreducenumber;

/**
 * @author israel
 * Daily problem leetcode 2024-05-29
 * <a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/description/?envType=daily-question&envId=2024-05-29">...</a>
 */
public class StepsReduceNumber {
   /* public int numSteps(String s) {
        int steps =0;
       // int number = Integer.parseInt(s,2); //<- Cause errors in
        long number = Long.parseLong(s,2);
        while (number !=1 ){
            if(number %2 == 0) {
                number = number /2;
            } else {
                number++;
            }
            steps++;
        }
        return steps;
    }*/

    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;
        int length = s.length();
        for(int i = length - 1; i >= 1; i--){
            int num = s.charAt(i) -'0';
            if(num == 0 && carry == 0){
                steps++;
            }else if(num == 1 && carry == 1){
                steps++;
                carry = 1;
            }else{
                steps += 2;
                carry = 1;
            }
        }
        if(carry == 1) {
            steps++;
        }
        return steps;
    }
}
