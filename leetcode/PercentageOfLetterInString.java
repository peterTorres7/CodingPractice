package leetcode;

/**

    Given a string s and a character letter, 
    return the percentage of characters in s that equal letter rounded down to the nearest whole percent.
    

    Example 1:

    Input: s = "foobar", letter = "o"
    Output: 33
    Explanation:
    The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, 
    so we return 33.

 */

public class PercentageOfLetterInString {
    
    // Time: O(n)
    // percentage of letter in string
    public static int percentageOfLetterInString (String s, char letter) {
        // init count to 0
        int count = 0;

        // for each char in s
        for (char c : s.toCharArray()) {
            // if char is equal to letter
            if (c == letter) {
                // increase count by 1
                count++;
            }
        }

        // return count times 100 divided by s length
        return count * 100 / s.length();
    }



    // main
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        System.out.println(percentageOfLetterInString(s, letter));
    }
}
