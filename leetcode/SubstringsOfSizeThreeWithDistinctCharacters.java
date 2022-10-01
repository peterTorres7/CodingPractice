package leetcode;

/**

    A string is good if there are no repeated characters.

    Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

    Note that if there are multiple occurrences of the same substring, 
    every occurrence should be counted.

    A substring is a contiguous sequence of characters in a string.
    

    Example 1:

    Input: s = "xyzzaz"
    Output: 1
    Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
    The only good substring of length 3 is "xyz".

 */

public class SubstringsOfSizeThreeWithDistinctCharacters {
 
    // Time: O(n)
    // substrings of size three with distinct characters using sliding window
    public static int substringsOfSizeThreeWithDistinctCharacters (String s) {
        // init ans to 0
        int ans = 0;
        
        // init i to 0
        int i = 0;
        // init j to 1
        int j = 1;
        // init k to 2
        int k = 2;

        // while k is less than s length
        while (k < s.length()) {
            // if s char at i is not equal to s char at j
            if (s.charAt(i) != s.charAt(j) 
            // AND s char at i is not equal to s char at k
            && s.charAt(i) != s.charAt(k)
            // AND s char at j is not equal to s char at k
            && s.charAt(j) != s.charAt(k)) {
                // increase ans by 1
                ans++; 
            }
            // increase i by 1
            i++;
            // increase j by 1
            j++;
            // increase k by 1
            k++;
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        String s = "xyzzaz";
        System.out.println(substringsOfSizeThreeWithDistinctCharacters(s));
    }
}
