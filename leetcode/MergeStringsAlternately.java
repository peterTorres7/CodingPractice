package leetcode;

/**

    You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, 
    starting with word1. If a string is longer than the other, 
    append the additional letters onto the end of the merged string.

    Return the merged string.

    
    Example 1:

    Input: word1 = "abc", word2 = "pqr"
    Output: "apbqcr"
    Explanation: The merged string will be merged as so:
    word1:  a   b   c
    word2:    p   q   r
    merged: a p b q c r

 */

public class MergeStringsAlternately {
    
    // Time: O(n)
    // merge strings alternately using two pointers
    public static String mergeStringsAlternately (String word1, String word2) {
        // init stringbuilder ans
        StringBuilder ans = new StringBuilder();
        // init word1Pointer to 0
        int word1Pointer = 0;
        // init word2Pointer to 0
        int word2Pointer = 0;
        // init word1Length 
        int word1Length = word1.length();
        // init word2Length
        int word2Length = word2.length();

        // while word1Pointer is less than word1Length OR word2Pointer is less than word2Length
        while (word1Pointer < word1Length || word2Pointer < word2Length) {
            // if word1Pointer is less than word1Length
            if (word1Pointer < word1Length) {
                // to ans append word1 char at word1Pointer
                ans.append(word1.charAt(word1Pointer));
                // increase word1Pointer by 1
                word1Pointer++;
            }
        
            // if word2Pointer is less than word2Length
            if (word2Pointer < word2Length) {
                // to ans append word2 char at word2Pointer
                ans.append(word2.charAt(word2Pointer));
                // increase word2Pointer by 1
                word2Pointer++;
            }
        }

        // return ans to string
        return ans.toString();
    }



    // main
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeStringsAlternately(word1, word2));
    }
}
