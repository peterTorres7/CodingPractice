package leetcode;

import java.util.HashMap;
import java.util.Map;

/**

    You are given a 0-indexed string s that has lowercase English letters in its even indices 
    and digits in its odd indices.

    There is a function shift(c, x), where c is a character and x is a digit, 
    that returns the xth character after c.

        For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.

    For every odd index i, you want to replace the digit s[i] with shift(s[i-1], s[i]).

    Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.


    Example 1:

    Input: s = "a1c1e1"
    Output: "abcdef"
    Explanation: The digits are replaced as follows:
    - s[1] -> shift('a',1) = 'b'
    - s[3] -> shift('c',1) = 'd'
    - s[5] -> shift('e',1) = 'f'

*/

public class ReplaceAllDigitsWithCharacters {
    
    // Time: O(n)
    // replace all digits with characters using maps
    public static String replaceAllDigitsWtihCharactersMaps (String s) {
        // init map of integer, char indexMap
        Map<Integer, Character> indexMap = new HashMap<>();
        // init map of char, integer charMap
        Map<Character, Integer> charMap = new HashMap<>();

        // init index to 1
        int index = 1;
        // for each char 'a' to 'z'
        for (char c = 'a'; c <= 'z'; c++) {
            // in indexMap put index, char
            indexMap.put(index, c);
            // in charMap put char, index
            charMap.put(c, index);
            // increase index by 1
            index++;
        }

        // init char array wordChars to s to char array
        char[] wordChars = s.toCharArray();
        // for each char i to wordChars length minus 1 increasing 1 by 2
        for (int i = 0; i < wordChars.length - 1; i += 2) {
            // init char index to charMap get wordChars at index
            int charIndex = charMap.get(wordChars[i]);
            // init intIndex to character get numeric value of wordChars at index plus one
            int intIndex = Character.getNumericValue(wordChars[i + 1]);
            // set wordChars at index plus one to indexMap get charIndx plus intIndex
            wordChars[i + 1] = indexMap.get(charIndex + intIndex);
        }

        // return new String of wordChars 
        return new String(wordChars);
    }


    // main
    public static void main(String[] args) {
        String s = "a1c1e1";
        System.out.println(replaceAllDigitsWtihCharactersMaps(s));
    }
}
