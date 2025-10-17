package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**

    Given a string s, return true if s is a good string, or false otherwise.

    A string s is good if all the characters that appear in s have the same number of occurrences 
    (i.e., the same frequency).
    

    Example 1:

    Input: s = "abacbc"
    Output: true

 */

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    
    // Time: O(n)
    // check if all characters have equal number of occurrences using map and set
    public static boolean checkIfAllCharactersHaveEqualNumberOfOccurrencesMapSet (String s) {
        // init map of character, integer
        Map<Character, Integer> map = new HashMap<>();

        // for each char in s
        for (char c : s.toCharArray()) {
            // in map put char, map get or default c, 0 plus 1
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // init set of integer to map values
        Set<Integer> set = new HashSet<>(map.values());

        // return set size equals 1
        return set.size() == 1;
    }

    // Time: O(n)
    // check if all characters have equal number of occurrences using array
    public static boolean checkIfAllCharactersHaveEqualNumberOfOccurrencesArray (String s) {
        // init freqCount to int array of 26
        int[] freqArray = new int[26];

        // for each char in s
        for (char c : s.toCharArray()) {
            // increase freqArray at char - 'a' by 1
            freqArray[c - 'a']++;
        }

        // init max to freqArray at 0
        int max = freqArray[0];
        // for each num in freqArray
        for (int num : freqArray) {
            // set max to Math max of max, num
            max = Math.max(max, num);
        }
        
        // for each num in freqArray
        for (int num : freqArray) {
            // if num is not max AND num is not 0 AND num is not s length
            if (num != max && num != 0 && num != s.length()) {
                // return false
                return false;
            }
        }

        // return true
        return true;
    }


    // main 
    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println(checkIfAllCharactersHaveEqualNumberOfOccurrencesArray(s));
    }
}
