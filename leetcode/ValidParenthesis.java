package leetcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        // initialize map with matching parenthesis
        Map<Character, Character> parenthesis = new HashMap<>();
        parenthesis.put('(', ')');
        parenthesis.put('{', '}');
        parenthesis.put('[', ']');
        
        // initialize empty stack
        Stack<Character> stack = new Stack<>();
        
        // loop through string 
        for (int i = 0; i < s.length(); i++) {
            // if stack has map key for str char at current index
            if (parenthesis.containsKey(s.charAt(i))) {
                // stack push 
                stack.push(parenthesis.get(s.charAt(i)));
                System.out.println(stack);
            }else if (stack.size() > 0 && stack.lastElement() == s.charAt(i)) { 
                // stack push str char at current index
                stack.pop();
            } else {
                return false;
            }
        }       
        System.out.println(stack);
        // return stack is empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
