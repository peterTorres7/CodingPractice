package leetcode;

/**

    You are given a 0-indexed string s consisting of only lowercase English letters, 
    where each letter in s appears exactly twice. 
    You are also given a 0-indexed integer array distance of length 26.

    Each letter in the alphabet is numbered from 0 to 25 
    (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, ... , 'z' -> 25).

    In a well-spaced string, the number of letters between the two occurrences of the ith letter is distance[i]. 
    If the ith letter does not appear in s, then distance[i] can be ignored.

    Return true if s is a well-spaced string, otherwise return false.
    

    Example 1:

    Input: s = "abaccb", distance = [1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
    Output: true

 */

public class CheckDistancesBetweenSameLetters {
    
    // Time: O(n)
    // check distances between same letters
    public static boolean checkDistancesBetweenSameLetters (String s, int[] distance) {
        // for each char in s to char array
        for (char c : s.toCharArray()) {
            // init first to s index of char
            int first = s.indexOf(c);
            // init last to s last index of char
            int last = s.lastIndexOf(c);
            // if distance at char minus - a is not equal to last minus first minus 1
            if (distance[c - 'a'] != last - first - 1) {
                // return false
                return false;
            }
        }

        // return true
        return true;
    }
}
