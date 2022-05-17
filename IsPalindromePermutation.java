import java.util.Arrays;

/**
 * This class checks to see if given string is a permutation of a palindrome."
 */

public class IsPalindromePermutation {
             
    // Time = O(n)
    // isPalindromePermutation using int array
    public static boolean isPalindromePermutationCharArray (String str) {
        // initize char array to hold char count
        int[] charCount = new int[128];
        // loop through str
        for (int i = 0; i < str.length(); i++) {
            // initialize int char value to str char at current index
            int charValue = str.charAt(i);
            // in char array at char value index increase by 1
            charCount[charValue]++; 
        }
            System.out.println(Arrays.toString(charCount));
        // initialize boolean to hold if odd seen to false
        boolean oddCountSeen = false;
        // loop through charCountsArray
        for (int i = 0; i < charCount.length; i++) {

            // if char count is odd
            if (charCount[i] % 2 != 0) {
                // if odd seen is true
                if (oddCountSeen) {
                    // return false since not a palindrome permutation
                    return false;
                }
                // set odd seen to true
                oddCountSeen = true;
            }
        }
        // return true after loop since it is palindrome permutation
        return true;
    };     

    // main method
    public static void main(String[] args) {
        System.out.println(isPalindromePermutationCharArray("tacto coa"));
    }
}
