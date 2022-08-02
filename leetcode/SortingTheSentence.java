package leetcode;

/**
    A sentence is a list of words that are separated by a single space 
    with no leading or trailing spaces. Each word consists of lowercase 
    and uppercase English letters.

    A sentence can be shuffled by appending the 1-indexed word position to each word 
    then rearranging the words in the sentence.

    For example, the sentence "This is a sentence" 
    can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".

    Given a shuffled sentence s containing no more than 9 words, 
    reconstruct and return the original sentence. 

    Example 1:

    Input: s = "is2 sentence4 This1 a3"
    Output: "This is a sentence"
 */

public class SortingTheSentence {
    
    // Time: O(n)
    // sorting the sentence using array
    public static String sortingTheSentenceArray (String s) {
        // init string array wordsArray to s split by " "
        String[] wordsArray = s.split(" ");
        // init string array ansArray to new string array of wordsArray length
        String[] ansArray = new String[wordsArray.length];

        // for each word in wordsArray
        for (String word : wordsArray) {
            // init ansIndex to Character get numeric value of word char at word length minus 1
            int ansIndex = Character.getNumericValue(word.charAt(word.length() - 1));
            // init ansWord to word replace word char at word length minus 1 with " "
            String ansWord = word.replace(word.charAt(word.length() - 1), ' ');
            // set ansArray at ansIndex - 1 to ansWord stripped
            ansArray[ansIndex - 1] = ansWord.strip();
        }

        // return String join with " " ansArray
        return String.join(" ", ansArray);
    }

    // main method
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortingTheSentenceArray(s));
    }
}
