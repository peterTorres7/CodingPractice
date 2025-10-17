package leetcode;

/**

    Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.


    Example 1:

    Input: s = "Hello"
    Output: "hello"

 */

public class ToLowerCase {

    // Time: O(1)
    // to lower case using toLowerCase method
    public static String toLowerCase (String s) {
        return s.toLowerCase();
    }

    // Time; O(n)
    // to lower case using loop
    public static String toLowerCaseLoop (String s) {
        // init stringbuilder sb
        StringBuilder sb = new StringBuilder();

        // for each char in s
        for (char c : s.toCharArray()) {
            // if char is upper case
            if (Character.isUpperCase(c)) {
                // to sb append char to lower case
                sb.append(Character.toLowerCase(c));
            } else {
                // else to sb append char
                sb.append(c);
            }
        }

        // return sb to string
        return sb.toString();
    }

    // main 
    public static void main(String[] args) {
        String s = "Hello";       
        System.out.println(toLowerCaseLoop(s));
    }
}
