package leetcode;

import java.util.Arrays;

/**
 * This class finds the longest common prefix string amongst an array of strings."
 */

public class LongestCommonPrefix {                                           

    // Time: O(nlog n)
    // Space: O(1)
    // Longest common prefix using sort
    public static String longestCommonPrefix (String[] strs) {
        // sort strs
        Arrays.sort(strs);
        // initialize stringbuilder 
        StringBuilder sb = new StringBuilder();
        
        // loop through strs first str
        for (int i = 0; i < strs[0].length(); i++) {
            // if strs first str char at current index is not equal to strs last str char at current index
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
                // break
                break;
            } else {
                // else to stringbuilder append strs first str char at current index
                sb.append(strs[0].charAt(i));
            }
        }
        // return stringbuilder as string
        return sb.toString();
    }

    // main method
    public static void main(String[] args) {
        String[] strs = new String[] {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
