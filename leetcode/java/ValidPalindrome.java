// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
// and removing all non-alphanumeric characters, it reads the same forward and backward. 
// Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.
    

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        // init pointers at ends
        int left = 0;
        int right = s.length() - 1;

        // while pointers don't cross
        while (left < right) {
            // confirm while pointers don't cross and left is not letter or digit increase left by 1
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // confirm while pointers don't cross and right is not letter or digit decrease right by 1
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // if lowercase left is not equal to lowercase right return false
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; 
            }

            // increase left and decrease right by 1
            left++;
            right--;
        }

        // return true since they all match
        return true;
    }


    // main
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}

// time: O(n)
// space: O(1)