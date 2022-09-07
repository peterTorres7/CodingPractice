package leetcode;

import java.util.HashMap;
import java.util.Map;

/**

    You are given a string s formed by digits and '#'. 
    We want to map s to English lowercase characters as follows:

        Characters ('a' to 'i') are represented by ('1' to '9') respectively.
        Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.

    Return the string formed after mapping.

    The test cases are generated so that a unique mapping will always exist.


    Example 1:

    Input: s = "10#11#12"
    Output: "jkab"

*/

public class DecryptStringFromAlphabetToIntegerMapping {
    
    // Time: O(n)
    // decrypt string from alphabet to integer mapping
    public static String decryptStringFromAlphabetToIntegerMapping (String s) {
        // init stringbuilder ans 
        StringBuilder ans = new StringBuilder();
        // init map of string and char
        Map<String, Character> map = new HashMap<>();
        
        // init num to 1
        int num = 1;
        // for each char 'a' to 'z'
        for (char c = 'a'; c <= 'z'; c++) {
            // if num is greater than or equal to 10
            if (num >= 10) {
                // in map put num plus "#", char
                map.put(num + "#", c);
                // increase num by 1
                num++;
            } else {
                // else in map put num, char
                map.put(num + "", c);
                // increase num by 1
                num++;
            }
        }


        // init sPointer to 0
        int sPointer = 0;
        // init stringbuilder subS to ""
        String subS = "";
        // while sPointer is less than s length
        while (sPointer < s.length()) {
            // if sPointer is less than s length minus 2 AND s char at sPointer plus 2 is equal to '#'
            if (sPointer < s.length() - 2 && s.charAt(sPointer + 2) == '#') {
                // set subS to s substring from sPointer to sPointer plus 3
                subS = s.substring(sPointer, sPointer + 3);
                // to ans append map get subS
                ans.append(map.get(subS));
                // increase sPointer by 3
                sPointer += 3;
            } else {
                // else set subS to s substring from sPointer to sPointer plus 1
                subS = s.substring(sPointer, sPointer + 1);
                // to ans append map get subS
                ans.append(map.get(subS));
                // increase sPointer by 1
                sPointer++;
            }
        }

        // return ans to string
        return ans.toString();
    }


    // main
    public static void main(String[] args) {
        String s = "1326#";
        System.out.println(decryptStringFromAlphabetToIntegerMapping(s));
    }
}
