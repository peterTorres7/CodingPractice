package leetcode;

/**

    You are given a string s, where every two consecutive vertical bars '|' are grouped into a pair. 
    In other words, the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.

    Return the number of '*' in s, excluding the '*' between each pair of '|'.

    Note that each '|' will belong to exactly one pair.

    
    Example 1:

    Input: s = "l|*e*et|c**o|*de|"
    Output: 2

 */

public class CountAsterisks {
    
    // Time: O(n)
    // count asterisks using brute force
    public static int countAsterisks (String s) {
        // init asterisk to 0
        int asterisk = 0;
        // init bar to 0
        int bar = 0;

        // for each char in s
        for (char c : s.toCharArray()) {
            // if char equals '|'
            if (c == '|') {
                // increase bar by 1
                bar++;
            }
            // if bar is even AND char equals '*'
            if (bar % 2 == 0 && c == '*') {
                // increase asterisk by 1
                asterisk++;
            }
        }

        // return asterisk
        return asterisk;
    }

    // main
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        System.out.println(countAsterisks(s));
    }
}
