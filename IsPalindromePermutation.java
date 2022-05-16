/**
 * This class checks to see if given string is a permutation of a palindrome."
 */

public class IsPalindromePermutation {
    
    //  "Tact Coa"      
    //   i                                                                                  
    //  [a, b, c, d, e, f, ... , x, y, z]
    //   1     1              2                       
    //                                               
    //                                               

    // isPalindromePermutation using char array
    public static boolean isPalindromePermutationCharArray (String str) {
        // initialze array of size 128 to hold ascii chars
        char[] charArray = new char[128];
        // loop through str
        for (int i = 0; i < str.length(); i++) {
            // initialze int charValue to each char in loop
            int charValue = str.charAt(i);
            // in charArray at charValue index increase count by 1
            charArray[charValue]++;
        }

        // initizalize boolean seenOdd to false
        boolean seenOdd = false;
        // loop through charArray
        for (int i = 0; i < charArray.length; i++) {
            // if char count in charArray is odd
            if (charArray[i] % 2 != 0) {
                // if seenOdd is true
                if (seenOdd) {
                    // return false since only one add char can appear
                    return false;
                // else set seenOdd to true
                } else {
                    seenOdd = true;
                }
            }
        }
        // return true after loop since it's palindrome permutation
        return true;
    };

    // main method
    public static void main(String[] args) {
        System.out.println(isPalindromePermutationCharArray("tacto coa"));
    }
}
