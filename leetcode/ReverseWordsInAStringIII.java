package leetcode;

/**

    Given a string s, reverse the order of characters in each word within a sentence 
    while still preserving whitespace and initial word order.


    Example 1:

    Input: s = "Let's take LeetCode contest"
    Output: "s'teL ekat edoCteeL tsetnoc"

 */

public class ReverseWordsInAStringIII {
    
    // Time: O()
    // reverse words in a string III 
    public static String reverseWordsInAStringIII (String s) {
        // init stringbuilder ans 
        StringBuilder ans = new StringBuilder();
        // init string array words to s split by " "
        String[] words = s.split("\\s");

        // for each word in words
        for (String word : words) {
            // init char array wordChars to word to char array
            char[] wordChars = word.toCharArray();
            // init left to 0
            int left = 0;
            // init right to wordChars length minus 1
            int right = wordChars.length - 1;
            // while left is less than right
            while (left < right) {
                // init tempChar to wordChars at left
                char tempChar = wordChars[left];
                // set wordChars at left to wordChars at right
                wordChars[left] = wordChars[right];
                // set wordChars at right to tempChar
                wordChars[right] = tempChar;
                // increase left by 1
                left++;
                // decrease right by 1
                right--;
            }
            // after while loop init string reversedWord to new string of wordsChars
            String reversedWord = new String(wordChars);
            // to ans append reversedWord append " "
            ans.append(reversedWord).append(" ");
        }

        // return ans to string trim
        return ans.toString().trim();
    }


    // main
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWordsInAStringIII(s));
    }
}
