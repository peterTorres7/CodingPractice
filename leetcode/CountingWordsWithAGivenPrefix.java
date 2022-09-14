package leetcode;

/**

    You are given an array of strings words and a string pref.

    Return the number of strings in words that contain pref as a prefix.

    A prefix of a string s is any leading contiguous substring of s.

    

    Example 1:

    Input: words = ["pay","attention","practice","attend"], pref = "at"
    Output: 2

 */

public class CountingWordsWithAGivenPrefix {
    
    // Time: O(n)
    // counting words with a given prefix
    public static int countingWordsWithAGivenPrefix (String[] words, String pref) {
        // init ans to 0
        int ans = 0;
        
        // for each word in words
        for (String word : words) {
            // if word index of pref equals 0
            if (word.indexOf(pref) == 0) {
                // increase ans by 1
                ans++;
            }
        }

        // return ans
        return ans;
    }


    // main
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(countingWordsWithAGivenPrefix(words, pref));
    }
}
