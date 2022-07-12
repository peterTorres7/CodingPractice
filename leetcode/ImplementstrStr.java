package leetcode;

/**
 * This class returns the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack. Given two strings needle and haystack."
 */

public class ImplementstrStr {
    
    // Time: O()
    // Space: O()
    // returns index of first occurence of needle in haystack
    public static int implementstrStr (String needle, String haystack) {
        // return haystack index of needle
        return haystack.indexOf(needle);
    }

    // main method
    public static void main(String[] args) {
        String needle = "ll";
        String haystack = "hello";
        System.out.println(implementstrStr(needle, haystack));
    }
}
