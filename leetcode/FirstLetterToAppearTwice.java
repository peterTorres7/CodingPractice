package leetcode;

import java.util.HashMap;
import java.util.Map;

/**

    Given a string s consisting of lowercase English letters, return the first letter to appear twice.

    Note:

        A letter a appears twice before another letter b 
        if the second occurrence of a is before the second occurrence of b.
        
        s will contain at least one letter that appears twice.

    Example 1:

    Input: s = "abccbaacz"
    Output: "c"

 */

public class FirstLetterToAppearTwice {
    
    // Time: O(n)
    // first lettr to appear twice using map
    public static char firstLetterToAppearTwiceMap (String s) {
        // init ans to 0
        char ans = 0;
        // init map of Character, Integer
        Map<Character, Integer> map = new HashMap<>();

        // for each char in s to char array
        for (char c : s.toCharArray()) {
            // in map put char, map get or default char, 0 plus 1
            map.put(c, map.getOrDefault(c, 0) + 1);
            // if map get char equals 2
            if (map.get(c) == 2) {
                // set ans to char
                ans = c;
                // break
                break;
            }
        }

        // return ans
        return ans;
    }


    // main
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(firstLetterToAppearTwiceMap(s));
    }
}
