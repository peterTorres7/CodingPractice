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
            // return false
            return false;
        }

        // return true
        return true;
    }


    // Time: O(n)
    // check if the sentence is pangram using index of
    public static boolean checkIfTheSentenceIsPangramIndexOf (String sentence) {

        // for each char 'a' to 'z'
        for (char c = 'a'; c <= 'z'; c++) {
            // if sentence doesn't contain char
            if (sentence.indexOf(c) == -1) {
                // set ans to false
                return false;
            }
        }

        // return true
        return true;
    }

    // main
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfTheSentenceIsPangramIndexOf(sentence));
    }
}
