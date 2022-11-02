package leetcode;

import java.util.Stack;

/**

    Given two strings s and t, return true if they are equal when both are typed into empty text editors. 
    '#' means a backspace character.

    Note that after backspacing an empty text, the text will continue empty.


    Example 1:

    Input: s = "ab#c", t = "ad#c"
    Output: true
    Explanation: Both s and t become "ac".

 */

public class BackspaceStringCompare {
    
    // Time: O(n)
    // backspace string compare using stacks
    public static boolean backspaceStringCompare (String s, String t) {
        // init sStack
        Stack<Character> sStack = new Stack<>();
        // init tStack
        Stack<Character> tStack = new Stack<>();

        // for each char in s
        for (char c : s.toCharArray()) {
            // if char is not equal to '#'
            if (c != '#') {
                // to sStack push char
                sStack.push(c);
            // else if sStack is not empty
            } else if (!sStack.isEmpty()) {
                // from sStack pop last char
                sStack.pop();
            }
        }

        // for each char in t
        for (char c : t.toCharArray()) {
            // if char is not equal to '#'
            if (c != '#') {
                // to tStack push char
                tStack.push(c);
            // else if tStack is not empty  
            } else if (!tStack.isEmpty()) {
                // from tStack pop last char
                tStack.pop();
            }
        }

        // return if sStack equals tStack
        return sStack.equals(tStack);
    }



    // main
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceStringCompare(s, t));
    }
}
