
/**
 * This class checks to see if given two String, is one String a 
 * permutation of the other String.
 */

public class IsPermutation {
                                            
    // isPermutaion using brute force
    public static boolean isPermutationBruteForce(String str1, String str2) {
        // if str1 length is not equal to str2 length return false
        if (str1.length() != str2.length()) {
            return false;
        }
        // if str1 or str2 is null return false
        if (str1 == null | str2 == null) {
            return false;
        }

        // initialize stringbuilder with str2
        StringBuilder str2StringBuilder = new StringBuilder(str2);
        // initialize str1 index to 0
        int str1Index = 0;
        // while str1Index is less than str1 length
        while (str1Index < str1.length()) {
            // if str2 contains str1 char at str1Index
            char str1Char = str1.charAt(str1Index); 
            if (str2StringBuilder.toString().contains(Character.toString(str1Char))) {
                // str2 stringbuilder remove char at index of char
                str2StringBuilder.deleteCharAt(str2StringBuilder.indexOf(Character.toString(str1Char)));
            } else {
                // else it doesn't contain char then return false
                return false;
            }
            // increase str1Index by 1
            str1Index++;
        }
        // return true since it is a permutation
        return true;
    }

    // main method
    public static void main(String[] args) {
        System.out.println(isPermutationBruteForce("words", "sword"));
    }
}
