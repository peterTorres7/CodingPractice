package leetcode;

/**

    Given a sentence that consists of some words separated by a single space, and a searchWord, 
    check if searchWord is a prefix of any word in sentence.

    Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. 
    If searchWord is a prefix of more than one word, return the index of the first word (minimum index). 
    If there is no such word return -1.

    A prefix of a string s is any leading contiguous substring of s.
    

    Example 1:

    Input: sentence = "i love eating burger", searchWord = "burg"
    Output: 4

 */

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    
    // Time: O(n)
    // check if a word occurs as a prefix of any word in a sentence
    public static int checkIfAWordOccursAsAPrefixOfAnyWordInASentence (String sentence, String searchWord) {
        // init ans to -1
        int ans = -1;
        // init words to sentence split by " "
        String[] words = sentence.split(" ");

        // for each word i in words 
        for (int i = 0; i < words.length; i++) {
            // if words at i starts with searchWord
            if (words[i].startsWith(searchWord)) {
                //  return i plus 1
                return i + 1;
            }
        }

        // return ans
        return ans;
    }


    // main
    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";

        System.out.println(checkIfAWordOccursAsAPrefixOfAnyWordInASentence(sentence, searchWord));
    }
}
