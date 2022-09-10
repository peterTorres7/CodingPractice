package leetcode;

import java.util.List;

/**

    You are given a string s of even length. Split this string into two halves of equal lengths, 
    and let a be the first half and b be the second half.

    Two strings are alike if they have the same number of vowels 
    ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). 
    Notice that s contains uppercase and lowercase letters.

    Return true if a and b are alike. Otherwise, return false.
    

    Example 1:

    Input: s = "book"
    Output: true
    Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.

 */

public class DetermineIfStringHalvesAreAlike {
    
    // Time: O(n)
    // determine if string halves are alike using list
    public static boolean determineIfStringHalvesAreAlike (String s) {
        // init list of vowels
        List<Character> list = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        // init a to 0
        int a = 0;
        // init b to 0
        int b = 0;

        // for each char i in s
        for (int i = 0; i < s.length(); i++) {
            // if i is less than s length divided by 2
            if (i < s.length() / 2) {
                // if list contains s char at i
                if (list.contains(s.charAt(i))) {
                    // increase a by 1
                    a++;
                } 
            } else {
                // else 
                // if list contains s char at i
                if (list.contains(s.charAt(i))) {
                    // increase b by 1
                    b++;
                }
            }
        }

        // return a equals b
        return a == b;
    }


    // main
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(determineIfStringHalvesAreAlike(s));
    }
}
