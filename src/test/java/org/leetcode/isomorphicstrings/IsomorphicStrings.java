package org.leetcode.isomorphicstrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**
 * @author israel
 * Daily problem leetcode 2024-04-02
 * <a href="https://leetcode.com/problems/isomorphic-strings/description/?envType=daily-question&envId=2024-04-02">...</a>
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> mapping = new HashMap<>();
        Set<Character> mappedChars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (!mapping.containsKey(charS)) {
                if (mappedChars.contains(charT)) {
                    return false;
                }
                mapping.put(charS, charT);
                mappedChars.add(charT);
            } else if (mapping.get(charS) != charT) {
                return false;
            }
        }

        return true;
    }
}
