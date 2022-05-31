package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

    // Time: O(n)
    // Space: O(n)
    // is valid using map and stack
    public static boolean isValid(String s) {
        // initialize map as pairs of brackets
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('(', ')');
        bracketMap.put('{', '}');
        bracketMap.put('[', ']');
        // initialize char stack
        Stack<Character> bracketStack = new Stack<>();
        
        // loop through s as char array
        for (char bracket : s.toCharArray()) {
            // if map contains key at currentChar
            if (bracketMap.containsKey(bracket)) {
                // in stack push map value of currentChar
                bracketStack.push(bracketMap.get(bracket));
            // else if stack is not empty AND stack peek is equal to currentChar
            } else if (!bracketStack.isEmpty() && bracketStack.peek() == bracket) {
                // pop the stack
                bracketStack.pop();
            // else return false
            } else {
                return false;
            }
            
        }
        // after loop return stack size is equal to 0
        return bracketStack.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid(""));
    }
}


















        // // initialize map with matching parenthesis
        // Map<Character, Character> parenthesis = new HashMap<>();
        // parenthesis.put('(', ')');
        // parenthesis.put('{', '}');
        // parenthesis.put('[', ']');
        
        // // initialize empty stack
        // Stack<Character> stack = new Stack<>();
        
        // // loop through string 
        // for (int i = 0; i < s.length(); i++) {
        //     // if stack has map key for str char at current index
        //     if (parenthesis.containsKey(s.charAt(i))) {
        //         // stack push 
        //         stack.push(parenthesis.get(s.charAt(i)));
        //     }else if (stack.size() > 0 && stack.lastElement() == s.charAt(i)) { 
        //         // stack push str char at current index
        //         stack.pop();
        //     } else {
        //         return false;
        //     }
        // }       

        // // return stack is empty
        // return stack.isEmpty();