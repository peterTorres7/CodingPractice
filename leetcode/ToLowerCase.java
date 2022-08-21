package leetcode;

/**

    Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.


    Example 1:

    Input: s = "Hello"
    Output: "hello"

 */

public class ToLowerCase {

    // Time: O(1)
    // to lower case
    public static String toLowerCase (String s) {
        return s.toLowerCase();
    }

    // main 
    public static void main(String[] args) {
        String s = "Hello";       
        System.out.println(toLowerCase(s));
    }
}
