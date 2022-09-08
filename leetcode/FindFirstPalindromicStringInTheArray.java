package leetcode;

/**

    Given an array of strings words, return the first palindromic string in the array. 
    If there is no such string, return an empty string "".

    A string is palindromic if it reads the same forward and backward.
    

    Example 1:

    Input: words = ["abc","car","ada","racecar","cool"]
    Output: "ada"

*/

public class FindFirstPalindromicStringInTheArray {
    
    // Time: O(n*m)
    // find first palindromic string in the array
    public static String findFirstPalindromicStringInTheArray (String[] words) {
        // init string ans to ""
        String ans = "";

        // for each word in words
        for (String word : words) {
            // init palindrome to true
            boolean palindrome = true;
            // init left to 0
            int left = 0;
            // init right to word length minus 1
            int right = word.length() - 1;
            // while left is less than right
            while (left < right) {
                // if word char at left is not equal to word char at right
                if (word.charAt(left) != word.charAt(right)) {
                     // set palindrome to false
                    palindrome = false;
                    // break
                    break;
                }
                // increase left by 1
                left++;
                // decrease right by 1
                right--;
            }
            // after while loop if palindrome is true
            if (palindrome) {
                // set ans to word
                ans = word;
                // break
                break;
            }
        }

        // return ans
        return ans;
    }


    // main
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(findFirstPalindromicStringInTheArray(words));
    }
}
