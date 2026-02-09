// You are given two strings word1 and word2. 
// Merge the strings by adding letters in alternating order, starting with word1. 
// If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.


// Example 1:

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"

public class MergeStringsAlternately {
    public static String mergeStringsAlternately(String word1, String word2) {
        // init read1
        int read1 = 0;
        // init read2
        int read2 = 0;
        // init string builder
        StringBuilder sb = new StringBuilder();

        // while read1 is less than word1 length or read2 is less than word2 length
        while (read1 < word1.length() || read2 < word2.length()) {
            // if read1 is less than word1 length
            if (read1 < word1.length()) {
                // to sb append word1 char at read1
                sb.append(word1.charAt(read1));
                // increase read1 by 1         
                read1++;       
            }

            // if read2 is less than word2 length
            if (read2 < word2.length()) {
                // to sb append word2 char at read2
                sb.append(word2.charAt(read2));
                // increase read2 by 1         
                read2++;          
            }
        }

        // return sb as string
        return sb.toString();
    }

    // main
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        System.out.println(mergeStringsAlternately(word1, word2));
    }

    // time: O(n)
    // space: O(n)
}