package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
    You are given a string s and an integer array indices of the same length. 
    The string s will be shuffled such that the character at the ith position 
    moves to indices[i] in the shuffled string.

    Return the shuffled string.

    Example 1:

    Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
    Output: "leetcode"
    Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
*/

public class ShuffleString {
    
    // Time: O(n)
    // shuffle string using map
    public static String shuffleStringMap (String s, int[] indices) {
        // initialize charMap
        Map<Integer, Character> charMap = new HashMap<>();
        // for indices length
        for (int i = 0; i < indices.length; i++) {
            // in map put indeces at current index, s char at current index
            charMap.put(indices[i], s.charAt(i));
        }

        // initialize stringbuilder sb
        StringBuilder sb = new StringBuilder();
        // for indices length
        for (int i = 0; i < indices.length; i++) {
            // to sb append map get current index
            sb.append(charMap.get(i));
        }

        // return sb to string
        return sb.toString();
    }

    // Time: O(n)
    // shuffle string using array
    public static String shuffleStringArray (String s, int[] indices) {
        // initialize charArray to indices length
        char[] charArray = new char[indices.length];
        // for indices length
        for (int i = 0; i < indices.length; i++) {
            // set charArray at indices at current index to s char at current index
            charArray[indices[i]] = s.charAt(i);
        }

        //  return new String of charArray
        return new String(charArray);
    }

    // main method
    public static void main (String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,1,2,3};
        System.out.println(shuffleStringArray(s, indices));
    }
}
