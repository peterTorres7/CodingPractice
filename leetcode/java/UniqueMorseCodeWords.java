package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**

    International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

        'a' maps to ".-",
        'b' maps to "-...",
        'c' maps to "-.-.", and so on.

    For convenience, the full table for the 26 letters of the English alphabet is given below:
    [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

    Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

    For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". 
    We will call such a concatenation the transformation of a word.

    Return the number of different transformations among all words we have.


    Example 1:

    Input: words = ["gin","zen","gig","msg"]
    Output: 2

*/

public class UniqueMorseCodeWords {

    // Time: O(n*m)
    // unique morese code words using map and set
    public static int uniqueMorseCodeWords (String[] words) {
        // init string array morseArray to given code
        String[] morseArray = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        // init Character and String map morseMap to new hashmap
        Map<Character, String> morseMap = new HashMap<>();
        // init string set morseSet to new hashset
        Set<String> morseSet = new HashSet<>();

        // init morseArrayIndex to 0
        int morseArrayIndex = 0;
        // for each char a to z
        for (char c = 'a'; c <= 'z'; c++) {
            // in map put char, morse at morseArrayIndex
            morseMap.put(c, morseArray[morseArrayIndex]);
            // increase morseArrayIndex by 1
            morseArrayIndex++;
        }

        // for each word in words
        for (String word : words) {
            // init stringbuilder sb to new stringbuilder
            StringBuilder sb = new StringBuilder();
            // for each char in word
            for (char c : word.toCharArray()) {
                // to sb append morseMap get char
                sb.append(morseMap.get(c));
            }
            // after inner loop to morseSet add sb to string
            morseSet.add(sb.toString());
        }
        
        // return morseSet size
        return morseSet.size();
    }

    // main method
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseCodeWords(words));
    }
}
