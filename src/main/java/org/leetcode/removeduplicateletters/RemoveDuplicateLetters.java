package org.leetcode.removeduplicateletters;

import java.util.*;

/**
 * @author israel
 * Daily problem leetcode 2023-09-26
 * https://leetcode.com/problems/remove-duplicate-letters/?envType=daily-question&envId=2023-09-26
 */
public class RemoveDuplicateLetters {
    public String removeDuplicateLettersMine(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int size = s.length();
        for (int i = 0; i < size ; i++) {
            map.put(s.charAt(i),i);
        }
        StringBuilder res = new StringBuilder();

        map.forEach( (k,v) ->  res.append(k));
        return res.toString();
    }
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        Set<Character> seen = new HashSet<>();
        Map<Character, Integer> lastOcc = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastOcc.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen.contains(c)) {
                while (!stack.isEmpty() && c < stack.peek() && i < lastOcc.get(stack.peek())) {
                    seen.remove(stack.pop());
                }
                seen.add(c);
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }
}
