package leetcode;

/**

    Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

    A string is represented by an array if the array elements concatenated in order forms the string.
    

    Example 1:

    Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
    Output: true

    Explanation:
    word1 represents string "ab" + "c" -> "abc"
    word2 represents string "a" + "bc" -> "abc"
    The strings are the same, so return true.

 */

public class CheckIfTwoStringArraysAreEquivalent {
    
    // Time: O(n)
    // check if two string arrays are equivalent
    public static boolean checkIfTwoStringArraysAreEquivalent (String[] word1, String[] word2) {
        // init stringbuilder sb1
        StringBuilder sb1 = new StringBuilder();
        // init stringbuilder sb2
        StringBuilder sb2 = new StringBuilder();

        // for each string in word1
        for (String s : word1) {
            // to sb1 append string
            sb1.append(s);
        }

        // for each string in word2
        for (String s : word2) {
            // to sb2 append string
            sb2.append(s);
        }

        // return sb1 to string equals sb2 to string
        return sb1.toString().equals(sb2.toString());
    }

    // main
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(checkIfTwoStringArraysAreEquivalent(word1, word2));
    }
}
