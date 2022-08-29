package leetcode;

import java.util.HashMap;
import java.util.Map;

/**

    A pangram is a sentence where every letter of the English alphabet appears at least once.

    Given a string sentence containing only lowercase English letters, 
    return true if sentence is a pangram, or false otherwise.
    

    Example 1:

    Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
    Output: true

 */

public class CheckIfTheSentenceIsPangram {
    
    // Time: O(n)
    // check if the senctence is pangram using map
    public static boolean checkIfTheSentenceIsPangramMap (String sentence) {
        // init ans to true
        boolean ans = true;
        // init map of Character, Boolean
        Map<Character, Boolean> map = new HashMap<>();
        
        // for each char 'a' to 'z'
        for (char c = 'a'; c <= 'z'; c++) {
            // in map put char, false
            map.put(c, false);
        }

        //for each char in sentence
        for (char c : sentence.toCharArray()) {
            // in map put char, true
            map.put(c, true);
        }

        // if map contains value false
        if (map.containsValue(false)) {
            // set ans to false
            ans = false;
        }

        // return ans
        return ans;
    }

    // main
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfTheSentenceIsPangramMap(sentence));
    }
}
