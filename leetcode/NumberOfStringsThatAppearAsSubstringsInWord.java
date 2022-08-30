package leetcode;

/**

    Given an array of strings patterns and a string word, 
    return the number of strings in patterns that exist as a substring in word.

    A substring is a contiguous sequence of characters within a string.


    Example 1:

    Input: patterns = ["a","abc","bc","d"], word = "abc"
    Output: 3

 */

public class NumberOfStringsThatAppearAsSubstringsInWord {
    
    // Time: O(n)
    // number of strings that appear as substrings in word using contains
    public static int numberOfStringsThatAppearAsSubstringsInWordContains (String[] patterns, String word) {
        // init ans to 0
        int ans = 0;
        
        // for each pattern in patters
        for (String pattern : patterns) {
            // if word contains pattern
            if (word.contains(pattern)) {
                // increase ans by 1
                ans++;
            }
        }

        // return ans
        return ans;
    }


    // main
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numberOfStringsThatAppearAsSubstringsInWordContains(patterns, word));
    }
}
