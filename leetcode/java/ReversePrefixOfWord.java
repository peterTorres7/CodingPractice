package leetcode;

/**

    Given a 0-indexed string word and a character ch, reverse the segment of word 
    that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). 
    If the character ch does not exist in word, do nothing.

        For example, if word = "abcdefd" and ch = "d", then you should 
        reverse the segment that starts at 0 and ends at 3 (inclusive). 
        The resulting string will be "dcbaefd".

    Return the resulting string.
    

    Example 1:

    Input: word = "abcdefd", ch = "d"
    Output: "dcbaefd"

 */

public class ReversePrefixOfWord {
   
    // Time: O(n)
    // reverse prefix of word 
    public static String reversePrefixOfWord (String word, char ch) {
        // init wordChars to word to char array
        char[] wordChars = word.toCharArray();
        // init left to 0
        int left = 0;
        // init right to word index of ch
        int right = word.indexOf(ch);

        // while left is less than right
        while (left < right) {
            // init temp to wordChars at left
            char temp = wordChars[left];
            // set wordChars at left to wordChars at right
            wordChars[left] = wordChars[right]; 
            // set wordChars at right to tem
            wordChars[right] = temp;
            // increase left by 1
            left++;
            // decrease right by 1
            right--;
        }

        // return new string of wordChars
        return new String(wordChars);
    }


    // main
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefixOfWord(word, ch));
    }
}
