package leetcode;

/**

    You are given a string allowed consisting of distinct characters and an array of strings words. 
    A string is consistent if all characters in the string appear in the string allowed.

    Return the number of consistent strings in the array words.
    

    Example 1:

    Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
    Output: 2

 */

public class CountTheNumberOfConsistentStrings {
    
    // Time: O(n*m)
    // count the number of consistent strings
    public static int countTheNumberOfConsistentStrings (String allowed, String[] words) {
        // init ans to 0
        int ans = 0;

        // for each word in words
        for (String word : words) {
            // init consistentWord to true
            boolean consistentWord = true;
            // for each char in word
            for (char c : word.toCharArray()) {
                // if allowed index of char doesn't exist
                if (allowed.indexOf(c) == -1) {
                    // set consistentWord to false
                    consistentWord = false;
                }
            }
            // after inner loop if consistentWord is true
            if (consistentWord) {
                // increase ans by 1
                ans++;
            }
        }

        // return ans
        return ans;
    }

    // main
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countTheNumberOfConsistentStrings(allowed, words));
    }

}
