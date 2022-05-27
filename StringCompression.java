/**
 * This class performs a basic string compression using
 * the counts of repeated chacters.
 */

public class StringCompression {                             

    // Time: O(n^2)
    // string compression using String as storage
    public static String stringCompressionString (String str) {
        // initialize compressedString to empty string
        String compressedString = "";
        // initialize charCount to 0
        int charCount = 0;
        // loop through str
        for (int i = 0; i < str.length(); i++) {
            // increase charCount by 1
            charCount++;
            // if i plus 1 is greater than or equal to str length OR str char at current index is not equal to str char at current index plus 1
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
            // to compressedString add str at current char
            compressedString += str.charAt(i);
            // to compressedString add charCount
            compressedString += charCount;
            // reset charcount to 0  
            charCount = 0;          
            }
        }
        // return smallest between str length and compressedString length
        return compressedString.length() < str.length() ? compressedString : str;
    }
                  
    // Time: O(n)
    // string compression using StringBuilder as storage
    public static String stringCompressionStringBuilder(String str) {
        // initialize compressedString as new StringBuilder
        StringBuilder compressedString = new StringBuilder();
        // initialize charCount to 0
        int charCount = 0;
        // loop through str
        for (int i = 0; i < str. length(); i++) {
            // increase charCount by 1
            charCount++;
            // if i + 1 is greater than or equal to str lenght OR str char at current index is not equal to str char at current index plus 1
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                // to compressedString add str char at current index
                compressedString.append(str.charAt(i));
                // to compressedString add charCount
                compressedString.append(charCount);
                // reset charCount to 0 
                charCount = 0;
            }
        }
        // return shortest string between str and compressedString
        return compressedString.length() < str.length() ? compressedString.toString() : str;
    }

    // main method
    public static void main(String[] args) {
        System.out.println(stringCompressionStringBuilder("aabcccccaaa"));
    }
}
