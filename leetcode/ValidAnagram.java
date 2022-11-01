package leetcode;

import java.util.Arrays;

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



    // main
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(validAnagramSort(s, t));
    }
}
