package leetcode;

/**

    There is a special typewriter with lowercase English letters 'a' to 'z' arranged in a circle 
    with a pointer. A character can only be typed if the pointer is pointing to that character. 
    The pointer is initially pointing to the character 'a'.

    Each second, you may perform one of the following operations:

        Move the pointer one character counterclockwise or clockwise.
        Type the character the pointer is currently on.

    Given a string word, return the minimum number of seconds to type out the characters in word.
    

    Example 1:

    Input: word = "abc"
    Output: 5
    Explanation: 
    The characters are printed as follows:
    - Type the character 'a' in 1 second since the pointer is initially on 'a'.
    - Move the pointer clockwise to 'b' in 1 second.
    - Type the character 'b' in 1 second.
    - Move the pointer clockwise to 'c' in 1 second.
    - Type the character 'c' in 1 second.

 */

public class MinimumTimeToTypeWordUsingSpecialTypewriter {
    
    // Time: O(n)
    // minimum time to type word using special typewriter
    public static int minimumTimeToTypeWordUsingSpecialTypewriter (String word) {
        // init ans to 0
        int ans = 0;
        // init prev to 'a'
        char prev = 'a';

        // for each char in word
        for (char c : word.toCharArray()) {
            // init diff to math absolute of prev minus c
            int diff = Math.abs(prev - c);
            // init counterDiff to 26 minus diff
            int counterDiff = 26 - diff;
            // to ans add math min of diff, counterDiff
            ans += Math.min(diff, counterDiff);
            // increase ans by 1
            ans++;
            // set prev to char
            prev = c;
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        String word = "abc";
        System.out.println(minimumTimeToTypeWordUsingSpecialTypewriter(word));
    }
}
