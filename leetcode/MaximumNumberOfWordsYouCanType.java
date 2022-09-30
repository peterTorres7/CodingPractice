package leetcode;

/**

    There is a malfunctioning keyboard where some letter keys do not work. 
    All other keys on the keyboard work properly.

    Given a string text of words separated by a single space (no leading or trailing spaces) 
    and a string brokenLetters of all distinct letter keys that are broken, 
    return the number of words in text you can fully type using this keyboard.
    

    Example 1:

    Input: text = "hello world", brokenLetters = "ad"
    Output: 1

 */

public class MaximumNumberOfWordsYouCanType {
    
    // Time: O(n*m)
    // maximum number of words you can type using brute force
    public static int maximumNumberOfWordsYouCanTypeBruteForce (String text, String brokenLetters) {
        // init ans to 0
        int ans = 0;
        // init words to text split by " "
        String[] words = text.split(" ");

        // for each word in words
        for (String word : words) {
            // init valid to true
            boolean valid = true;
            // for each char in brokenLetters to charArray
            for (char c : brokenLetters.toCharArray()) {
                // if word index of char is not equal to -1
                if (word.indexOf(c) != -1) {
                    // set valid to false
                    valid = false;
                }
            }
            // after inner for loop if valid is true
            if (valid) {
                // increase ans by 1
                ans++;
            }
        }

        // return ans 
        return ans;
    }



    // main
    public static void main(String[] args) {
        String text = "hello world";
        String brokenLetters = "ad";
        System.out.println(maximumNumberOfWordsYouCanTypeBruteForce(text, brokenLetters));
    }
}
