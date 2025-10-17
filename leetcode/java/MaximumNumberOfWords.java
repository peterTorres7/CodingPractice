package leetcode;

/**
 * This class returns the maximum number of words that appear in a single sentence
 * from a given array."
 */

public class MaximumNumberOfWords {
    
    // Time: O(n*m)
    // maximum number of words using for loop
    public static int maximumNumberOfWords(String[] sentences) {
        // initialize maxWords to 0
        int maxWords = 0;
        // for each sentence in sentences
        for (String sentence : sentences) {
            // initialize splitSentence to sentence split by " "
            String[] splitSentence = sentence.split("\\s+");
            // if splitSentence length is greater than maxWords
            if (splitSentence.length > maxWords) {
                // set maxWords to splitSentence length
                maxWords = splitSentence.length;
            }
        }
        // after loop return maxWords
        return maxWords;
    }

    // main method
    public static void main(String[] args) {
        String[] sentences = {"this is in Java", "I like solving all these puzzles", "hello"};
        System.out.println(maximumNumberOfWords(sentences));
    }
    
}
