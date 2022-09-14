package leetcode;

/**

    You are given a string array words and a string s, 
    where words[i] and s comprise only of lowercase English letters.

    Return the number of strings in words that are a prefix of s.

    A prefix of a string is a substring that occurs at the beginning of the string. 
    A substring is a contiguous sequence of characters within a string.
    

    Example 1:

    Input: words = ["a","b","c","ab","bc","abc"], s = "abc"
    Output: 3

 */

public class CountPrefixesOfAGivenString {
    
    // Time: O(n)
    // count prefixes of a given string
    public static int countPrefixesOfAGivenString (String[] words, String s) {
        // init ans to 0
        int ans = 0;
        
        // for each word in words
        for (String word : words) {
            // if s starts with word
            if (s.startsWith(word)) {
                // increase ans by 1
                ans++;
            }
        }

        // return ans
        return ans;
    }


    // main
    public static void main(String[] args) {
        String[] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        System.out.println(countPrefixesOfAGivenString(words, s));
    }
}
