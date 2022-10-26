package leetcode;

/**

    We define the usage of capitals in a word to be right when one of the following cases holds:

        All letters in this word are capitals, like "USA".
        All letters in this word are not capitals, like "leetcode".
        Only the first letter in this word is capital, like "Google".

    Given a string word, return true if the usage of capitals in it is right.

    

    Example 1:

    Input: word = "USA"
    Output: true

    Example 2:

    Input: word = "FlaG"
    Output: false

 */

public class DetectCapital {
    
    // Time: O(n)
    // detect capital
    public static boolean detectCapital (String word) {
        // if word equals word to upper case
        // OR word equals word to lower case
        // OR word equals word char at 0 to upper case plus word starting at 1 to lower case
        // return true
        // else return false
        return word.equals(word.toUpperCase()) 
            || word.equals(word.toLowerCase())
            || word.equals(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase());
    }



    // main
    public static void main(String[] args) {
        String word = "FlaG";
        System.out.println(detectCapital(word));
    }
}
