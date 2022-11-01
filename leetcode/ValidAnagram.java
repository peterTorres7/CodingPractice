package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**

    Given two strings s and t, return true if t is an anagram of s, and false otherwise.

    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
    typically using all the original letters exactly once.
    

    Example 1:

    Input: s = "anagram", t = "nagaram"
    Output: true

 */

public class ValidAnagram {
    
    // Time: O(nlogn)
    // valid anagram using sort
    public static boolean validAnagramSort (String s, String t) {
        // if s length is not equal to t length 
        if (s.length() != t.length()) {
            // return false
            return false;
        }

        // init sLetters to s to char array
        char[] sLetters = s.toCharArray();
        // init tLetters to t to char array
        char[] tLetters = t.toCharArray();
        // sort sLetters
        Arrays.sort(sLetters);
        // sort tLetters
        Arrays.sort(tLetters);

        // for each i in sLetters
        for (int i = 0; i < sLetters.length; i++) {
            // if sLetters at i is not equal to tLetters at i
            if (sLetters[i] != tLetters[i]) {
                // return false
                return false;
            }
        }

        // return true
        return true;
    }


    // Time: O(n)
    // valid anagram using map
    public static boolean validAnagramMap (String s, String t) {
        // if s length is not equal to t length
        if (s.length() != t.length()) {
            // return false
            return false;
        }
        
        // init sMap
        Map<Character, Integer> sMap = new HashMap<>();
        // init tMap
        Map<Character, Integer> tMap = new HashMap<>();

        // for each char in s
        for (char c : s.toCharArray()) {
            // in sMap put char increased by 1
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        // for each char in t
        for (char c : t.toCharArray()) {
            // in tMap put char increased by 1
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        // return if sMap equals tMap
        return sMap.equals(tMap);
    }


    // main
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(validAnagramMap(s, t));
    }
}
