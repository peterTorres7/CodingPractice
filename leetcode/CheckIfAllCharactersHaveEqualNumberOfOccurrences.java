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


    // main 
    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println(checkIfAllCharactersHaveEqualNumberOfOccurrencesMapSet(s));
    }
}
