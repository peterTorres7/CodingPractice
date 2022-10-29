package leetcode;

/**

    Given a string s, reverse only all the vowels in the string and return it.

    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, 
    more than once.
    

    Example 1:

    Input: s = "hello"
    Output: "holle"

 */

public class ReverseVowelsOfAString {
    
    // Time: O(n)
    // reverse vowels of a string
    public static String reverseVowelsOfAString (String s) {
        // init letters to s to char array
        char[] letters = s.toCharArray();
        // init left to 0
        int left = 0;
        // init right to letters length minus 1
        int right = letters.length - 1;

        // while left is less than right
        while (left < right) {
            // if letters at left is vowel AND letters at right is vowel
            if (isVowel(letters[left]) && isVowel(letters[right])) {
                // init temp to letters at left
                char temp = letters[left];
                // set letters at left to letters at right
                letters[left] = letters[right];
                // set letters at right to temp
                letters[right] = temp;
                // increase left by 1
                left++;
                // decrease right by 1
                right--;
            // else if letters at left is not vowel
            } else if (!isVowel(letters[left])) {
                // increase left by 1
                left++;
            } else {
                // else decrease right by 1
                right--;
            }
        }

        // return new string of letters 
        return new String(letters);
    }

    // helper method to check if char is vowel
    public static boolean isVowel (Character c) {
        // return if c is a vowel
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }



    // main
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowelsOfAString(s));
    }
}
