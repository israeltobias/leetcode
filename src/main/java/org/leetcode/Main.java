package org.leetcode;


import org.leetcode.tasksscheduler.TaskScheduler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public enum estadosSEDEIdsOrdinal {

        REGISTRADO, LEIDO, CONFORME, NOCONFORME, PTESUBSANACION, FINACTUACION, ARCHIVADO, PTEREVSUBSANACION;

        public int get() {
            return this.ordinal() + 1;
        }
    }

    public static void main(String[] args) {
        /*GasStation station = new GasStation();
        int[] gas = {5,1,2,3,4} ;//{1,2,3,4,5};
        int[] cost = {4,4,1,5,1}; //{3,4,5,1,2};
        int res = station.canCompleteCircuit(gas, cost);
        System.out.println("Res: " + res);*/
        //  TwoSum twoSum = new TwoSum();
        /*int[] nums = {2,7,11,15};c
        int[] ret = twoSum.twoSum(nums, 9);
        System.out.println(ret[0] + " " + ret[1]);*/
        /*WordPattern wordPattern = new WordPattern();
        boolean res =wordPattern.wordPattern("abba", "dog cat cat dog");
        System.out.println("Res: " + res);*/
      /*  DetectCapital detectCapital = new DetectCapital();
        System.out.println("Res: " + detectCapital.detectCapitalUse("usa"));*/
        /*int key= 6;
        String strKey ="c";
        System.out.println(Arrays.asList(3, 6, 9, 12, 15).stream().anyMatch(value -> value == key));
        Arrays.asList(3, 6, 9, 12, 15).stream().filter(val -> val == key).findFirst().ifPresent(val->{
            System.out.println("hola");
            System.out.println(val);
        });
        Stream.of("a", "b", "c", "d", "").filter(val -> val == strKey).findFirst().ifPresent(val->{
            System.out.println("hola");
            System.out.println(val);
        });*/
       /* IsPalindrome isPalindrome = new IsPalindrome();
       // System.out.println(isPalindrome.isPalindrome(-121));
        System.out.println(isPalindrome.isPalindromeWithoutConvertString(-121));*/
       /* Solution roman = new Solution();
        System.out.println(roman.romanToInt("MCMXCIV"));*/
       /* PermutationString permutationString = new PermutationString();
        System.out.println(permutationString.checkInclusion("ab","ab"));*/
        //String disposition = "attachment; filename=\"a.pdf\"; filename*=UTF-8''a.pdf";
        /*SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        int r;
        smallestInfiniteSet.addBack(2);    // 2 is already in the set, so no change is made.
        r = smallestInfiniteSet.popSmallest(); // return 1, since 1 is the smallest number, and remove it from the set.
        System.out.println(r);
        r =smallestInfiniteSet.popSmallest(); // return 2, and remove it from the set.
        System.out.println(r);
        r =smallestInfiniteSet.popSmallest(); // return 3, and remove it from the set.
        System.out.println(r);
        smallestInfiniteSet.addBack(1);    // 1 is added back to the set.
        r=smallestInfiniteSet.popSmallest(); // return 1, since 1 was added back to the set and
        System.out.println(r);
        // is the smallest number, and remove it from the set.
        r=smallestInfiniteSet.popSmallest(); // return 4, and remove it from the set.
        System.out.println(r);
        r=smallestInfiniteSet.popSmallest(); // return 5, and remove it from the set.
        System.out.println(r);*/
       /* String[] items = {"flower", "flow", "flight","person"};
        for (String item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
        Arrays.sort(items);
        for (String item : items) {
            System.out.print(item + " ");
        }*/

        Map<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('d',1);
        map.put('c',1);
        map.put('b',1);
        map.put('a',1);
        map.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
    }
}