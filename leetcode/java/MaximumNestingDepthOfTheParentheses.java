package leetcode;

/**
    A string is a valid parentheses string (denoted VPS) if it meets one of the following:

        It is an empty string "", or a single character not equal to "(" or ")",
        It can be written as AB (A concatenated with B), where A and B are VPS's, or
        It can be written as (A), where A is a VPS.

    We can similarly define the nesting depth depth(S) of any VPS S as follows:

        depth("") = 0
        depth(C) = 0, where C is a string with a single character not equal to "(" or ")".
        depth(A + B) = max(depth(A), depth(B)), where A and B are VPS's.
        depth("(" + A + ")") = 1 + depth(A), where A is a VPS.

    For example, "", "()()", and "()(()())" 
    are VPS's (with nesting depths 0, 1, and 2), and ")(" and "(()" are not VPS's.

    Given a VPS represented as string s, return the nesting depth of s.


    Example 1:

    Input: s = "(1+(2*3)+((8)/4))+1"
    Output: 3
    Explanation: Digit 8 is inside of 3 nested parentheses in the string.

 */

public class MaximumNestingDepthOfTheParentheses {
    
    // Time: O(n)
    // maximum nesting depth of the parentheses using for loop
    public static int maximumNestingDepthOfTheParentheses (String s) {
        // init maxDepth to 0
        int maxDepth = 0;
        // init currentDepth to 0
        int currentDepth = 0;

        // for each char i in s length
        for (int i = 0; i < s.length(); i++) {
            // if s char at i equals '('
            if (s.charAt(i) == '(') {
                // increase currentDepth by 1
                currentDepth++;
                // if currentDepth is greater than maxDepth
                if (currentDepth > maxDepth) {
                    // set maxDepth to currentDepth
                    maxDepth = currentDepth;
                }
            // else if s char equals ')'
            } else if (s.charAt(i) == ')') {
                // decrease currentDepth by 1
                currentDepth--;
            }
        }

        // return maxDepth
        return maxDepth;
    }

    // main method
    public static void main (String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maximumNestingDepthOfTheParentheses(s));
    }
}
