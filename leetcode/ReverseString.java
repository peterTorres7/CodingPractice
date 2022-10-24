package leetcode;

/**

    Write a function that reverses a string. The input string is given as an array of characters s.

    You must do this by modifying the input array in-place with O(1) extra memory.

    

    Example 1:

    Input: s = ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]

 */

public class ReverseString {
    
    // Time: O(n)
    // reverse string in place
    public static void reverseString (char[] s) {
        // init left to 0
        int left = 0;
        // init right to s length minus 1
        int right = s.length - 1;

        // while left is less than right
        while (left < right) {
            // init temp to s at left
            char temp = s[left];
            // set s at left to s at right
            s[left] = s[right];
            // set s at right to temp
            s[right] = temp;
            // increase left by 1
            left++;
            // decrease right by 1
            right--;
        }
    }



    // main
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
}
