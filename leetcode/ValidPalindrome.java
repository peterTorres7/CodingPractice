package leetcode;

/**

    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
    and removing all non-alphanumeric characters, it reads the same forward and backward. 
    Alphanumeric characters include letters and numbers.

    Given a string s, return true if it is a palindrome, or false otherwise.
    

    Example 1:

    Input: s = "A man, a plan, a canal: Panama"
    Output: true

 */

public class ValidPalindrome {
    
    // Time: O(n)
    // valid palindrome
    public static boolean validPalindrome (String s) {
        // init stringbuilder sb
        StringBuilder sb = new StringBuilder();
        // init sLower to s to lower case
        String sLower = s.toLowerCase();

        // for each char in sLower
        for (char c : sLower.toCharArray()) {
            // if char is between 'a' to 'z' OR '0' to '9'
            if (c >= 'a' && c <= 'z' || c - '0' >= 0 && c - '0' <= 9) {
                // to sb append char
                sb.append(c);
            }
        }

        // init letters to sb to string to char array
        char[] letters = sb.toString().toCharArray();
        // init left to 0
        int left = 0;
        // init right to letters length minus 1
        int right = letters.length - 1;

        // while left is less than right
        while (left < right) {
            // if letters at left is not equal to letters at right
            if (letters[left] != letters[right]) {
                // return false
                return false;
            }
            // increase left by 1
            left++;
            // decrease right by 1
            right--;
        }

        // return true
        return true;
    }



    // main
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(s));
    }
}
