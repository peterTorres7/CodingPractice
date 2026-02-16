import java.util.Stack;

// Given two strings s and t, return true if they are equal when both are typed into empty text editors. 
// '#' means a backspace character.

// Note that after backspacing an empty text, the text will continue empty.
 

// Example 1:

// Input: s = "ab#c", t = "ad#c"
// Output: true

public class BackspaceStringCompare {
    public static boolean backspaceStringCompare(String s, String t) {
            // init stacks
            Stack<Character> sStack = new Stack<>();
            Stack<Character> tStack = new Stack<>();
            
            // for letter in s to char array
            for (char letter : s.toCharArray()) {
                // if letter is equal to '#'
                if (letter == '#') {
                    // if s stack is not empty
                    if (!sStack.isEmpty()) {
                        // pop                    
                        sStack.pop();
                    }
                }
                // else
                else {
                    // to s stack push letter                
                    sStack.push(letter);
                }
            }
            
            // for letter in t to char array
            for (char letter : t.toCharArray()) {
                // if letter is equal to '#'
                if (letter == '#') {
                    // if t stack is not empty
                    if (!tStack.isEmpty()) {
                        // pop                    
                        tStack.pop();
                    }
                }
                // else
                else {
                    // to t stack push letter                
                    tStack.push(letter);
                }
            }

            // return if s stack equals t stack
            return sStack.equals(tStack);
    }

    // main
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        System.out.println(backspaceStringCompare(s, t));
    }
}

// time: O(n)
// space: O(n)