package org.leetcode.detectcapital;

public class DetectCapital {

    public DetectCapital() {
        super();
    }
    public boolean detectCapitalUse(String word) {
        /*return word.toUpperCase().equals(word) || word.toLowerCase().equals(word) ||
        word.equals(word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase());*/
        return word.matches("(^[A-Z]*$)|(^([A-Z])[a-z]*$)|(^[a-z]*$)");
    }
}
