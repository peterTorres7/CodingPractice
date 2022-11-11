package leetcode;

/**

    Given a string s consisting of only the characters 'a' and 'b', 
    return true if every 'a' appears before every 'b' in the string. Otherwise, return false.
    

    Example 1:

    Input: s = "aaabbb"
    Output: true
    Explanation:
    The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
    Hence, every 'a' appears before every 'b' and we return true.

 */

public class CheckIfAllAsAppearsBeforeAllBs {
    
    // Time: O(n)
    // check if all a's appears before all b's
    public static boolean checkIfAllAsAppearsBeforeAllBs (String s) {
        // init lastA
        int lastA = s.lastIndexOf('a');
        // init firstB
        int firstB = s.indexOf('b');

        // if firstA OR lastB is equal to -1
        if (lastA == -1 || firstB == -1) {
            // return true
            return true;
        }

        // return if lastA is less than firstB
        return lastA < firstB;
    }



    // main
    public static void main(String[] args) {
        String s = "aaabbb";
        System.out.println(checkIfAllAsAppearsBeforeAllBs(s));
    }
}
