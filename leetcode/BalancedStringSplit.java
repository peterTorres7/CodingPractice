package leetcode;

public class BalancedStringSplit {
    /**
        Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

        Given a balanced string s, split it into some number of substrings such that:

            Each substring is balanced.

        Return the maximum number of balanced strings you can obtain.

        

        Example 1:

        Input: s = "RLRRLLRLRL"
        Output: 4
        Explanation: s can be split into "RL", "RRLL", "RL", "RL", 
                    each substring contains same number of 'L' and 'R'.

     */


     // Time: O(n)
     // balanced string split using for loop
     public static int balancedStringSplit (String s) {
        // initialize ans to 0
        int ans = 0;
        // initialize balanceCount to 0
        int balanceCount = 0;

        // for each char in s length
        for (int i = 0; i < s.length(); i++) {
            // if char is equal to 'L'
            if (s.charAt(i) == 'L') {
                // increase balanceCount by 1
                balanceCount++;
            } else {
                // else decrease balanceCount by 1
                balanceCount--;
            }

            // if balanceCount is equal to 0
            if (balanceCount == 0) {
                // increase ans by 1
                ans++;
            }
        }

        // return ans
        return ans;
     }

     // main method
     public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
     }

}
