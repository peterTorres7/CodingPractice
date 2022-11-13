package leetcode;

/**

    You are given a string s consisting of lowercase English letters. 
    A duplicate removal consists of choosing two adjacent and equal letters and removing them.

    We repeatedly make duplicate removals on s until we no longer can.

    Return the final string after all such duplicate removals have been made. 
    It can be proven that the answer is unique.

    

    Example 1:

    Input: s = "abbaca"
    Output: "ca"
    Explanation: 
    For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, 
    and this is the only possible move.  The result of this move is that the string is "aaca", 
    of which only "aa" is possible, so the final string is "ca".

 */

public class RemoveAllAdjacentDuplicatesInString {
    
    // Time: O(n)
    // remove all adjacent duplicates in string
    public static String removeAllAdjacenDuplicatesInString (String s) {
        // init stringbuilder ans
        StringBuilder ans = new StringBuilder();

        // for each char in s
        for (char c : s.toCharArray()) {
            // init ansLength
            int ansLength = ans.length();
            // if ansLength is greater than 0 AND ans char at ansLength minus 1 is equal to char
            if (ansLength > 0 && ans.charAt(ansLength - 1) == c) {
                // from ans delete char at ansLength minus 1
                ans.deleteCharAt(ansLength - 1);
            } else {
                // else to ans append char
                ans.append(c);
            }
        }

        // return ans to string
        return ans.toString();
    }



    // main
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeAllAdjacenDuplicatesInString(s));
    }
}
