import java.util.Stack;

// Given two strings s and t, return true if they are equal when both are typed into empty text editors. 
// '#' means a backspace character.

// Note that after backspacing an empty text, the text will continue empty.
 

// Example 1:

// Input: s = "ab#c", t = "ad#c"
// Output: true

public class BackspaceStringCompare {

    // pattern: two pointers
    public static boolean BackspaceStringComparePointers(String s, String t) {
        // init pointers and counters
        int sPointer = s.length() - 1;
        int tPointer = t.length() - 1;
        int sSkip = 0;
        int tSkip = 0;

        // while t or s have letters to read
        while (sPointer >= 0 || tPointer >= 0) {
            // while s has letters to read
            while (sPointer >= 0) {
                // if letter is '#' increase s skip and decrease s pointer
                if (s.charAt(sPointer) == '#') {
                    sSkip++;
                    sPointer--;
                }
                // else if there are s skip decrease s pointer and s skip
                else if (sSkip > 0) {
                    sSkip--;
                    sPointer--;
                }
                // else break since there is s letter to compare   
                else break;            
            }

            // while t has letters to read
            while (tPointer >= 0) {
                // if letter is '#' increase t skip and decrease t pointer
                if (t.charAt(tPointer) == '#') {
                    tSkip++;
                    tPointer--;
                }
                // else if there are t skip decrease t pointer and t skip
                else if (tSkip > 0) {
                    tSkip--;
                    tPointer--;
                }
                // else break since there is t letter to compare    
                else break;            
            }

            
            // if s and t have letters to read
            if (sPointer >= 0 && tPointer >= 0) {
                // if letters don't match return false
                if (s.charAt(sPointer) != t.charAt(tPointer)) {
                    return false;
                }
            }
            // else if s has letters to read and t does not or s doesn't have letters to read and t does return false
            else if ((sPointer >= 0 && tPointer < 0) || (sPointer < 0 && tPointer >= 0)) {
                return false;
            }

            // decrease t and s pointer since letters match            
            sPointer--;
            tPointer--;
        }

        
        // return true since s and t match
        return true;
    }

    // time: O(n + m)
    // space: O(1)


    // pattern: stacks
    public static boolean backspaceStringCompareStacks(String s, String t) {
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

    // time: O(n + m)
    // space: O(n)


    // main
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        System.out.println(backspaceStringCompareStacks(s, t));
        System.out.println(BackspaceStringComparePointers(s, t));
    }
}

