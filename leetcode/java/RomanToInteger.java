package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * This class gives the integer value of a Roman number."
 */

public class RomanToInteger {
    
    // Time: O(n)
    // Space: O(1)
    // Roman to integer using map
    public static int romanToInteger (String str) {

        // initialize map to hold roman to integer values
        Map<Character, Integer> romanToIntegerMap = new HashMap<>();
        // add values to map
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);

        // initialize int result to 0
        int result = 0;
        // loop through str length
        for (int i = 0; i < str.length(); i++) {
            // if map get value of str at current char is less than map get value of str at current char plus 1
            if (i + 1 < str.length() && romanToIntegerMap.get(str.charAt(i)) < romanToIntegerMap.get(str.charAt(i + 1))) {
                // to result subtract map get value of str at current char
                result -= romanToIntegerMap.get(str.charAt(i));
            } else {
                // else to result add map get value of str at current char
                result += romanToIntegerMap.get(str.charAt(i));
            }
        }
        // return result 
        return result;
    }

        // main method
        public static void main(String[] args) {
            String roman = "XVII";
            System.out.println(romanToInteger(roman));
        }
}
