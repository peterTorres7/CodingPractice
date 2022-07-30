package leetcode;

import java.util.HashMap;
import java.util.Map;

/**

    You are given the strings key and message, which represent a cipher key 
    and a secret message, respectively. The steps to decode message are as follows:

    Use the first appearance of all 26 lowercase English letters in key 
    as the order of the substitution table.
    Align the substitution table with the regular English alphabet.
    Each letter in message is then substituted using the table.
    Spaces ' ' are transformed to themselves.

    For example, given key = "happy boy" 
    (actual key would have at least one instance of each letter in the alphabet), 
    we have the partial substitution table of 
    ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').

    Return the decoded message.

    Example 1:

    Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
    Output: "this is a secret"

 */
public class DecodeTheMessage {
    
    // Time: O(n)
    // decode message using map
    public static String decodeTheMessageMap (String key, String message) {
        // initialize map
        Map<Character, Character> charMap = new HashMap<>();
        // initialize alphabetChar to 'a'
        char alphabetChar = 'a';

        // for each char in key
        for (int i = 0; i < key.length(); i++) {
            // if char is a space
            if (key.charAt(i) == ' ') {
                // continue
                continue;
            }
            // if map doens't contain key at at current index
            if (!charMap.containsKey(key.charAt(i))) {
                // in map put key char at current index, alphabetChar
                charMap.put(key.charAt(i), alphabetChar);
                // increase alphabetChar by 1
                alphabetChar++;
            }
        }

        // initialize stringbuilder sb
        StringBuilder sb = new StringBuilder();

        // for each char in message
        for (int i = 0; i < message.length(); i++) {
            // if message char at current index is a space
            if (message.charAt(i) == ' ') {
                // to sb append a space
                sb.append(" ");
            } else {
                // else to sb append map get message char at current index
                sb.append(charMap.get(message.charAt(i)));
            }
        }

        // return sb to string
        return sb.toString();
    }

    // main method
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(decodeTheMessageMap(key, message));
    }
}
