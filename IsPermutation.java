import java.util.Arrays;

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
            // if str2StringBuilder contains str1 char at str1Index
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
    };                                                                                      

    // Time: O(n log(n))
    // isPermutaion using sort
    public static boolean isPermutationSort(String str1, String str2) {
        // if str1 length is not equal to str2 length return false
        if (str1.length() != str2.length()) {
            return false;
        }
        // if str1 or str2 is null return false
        if (str1 == null | str2 == null) {
            return false;
        }
        
        // turn str1 and str2 into char arrays
        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();
        
        // sort both char arrays
        Arrays.sort(charStr1);
        Arrays.sort(charStr2);

        // initialize new String of now sorted char arrays
        String sortedStr1 = new String(charStr1);
        String sortedStr2 = new String(charStr2);

        // return if sortedStr1 is equal to sortedStr2
        return sortedStr1.equals(sortedStr2);
    };
                                                            
    // isPermutation using char array
    public static boolean isPermutationCharArray(String str1, String str2) {
        // if lengths are different return false
        if (str1.length() != str2.length()) { return false; }
        // if either is null return false
        if (str1 == null | str2 == null) { return false; }

        // initialize int array to hold all ascii char counts
        int[] charCount = new int[128];

        // loop through str1
        for (int i = 0; i < str1.length(); i++) {
            // increase count by one in char array for each char
            charCount[str1.charAt(i)]++;
        }

        // loop through str2
        for (int i =0; i < str2.length(); i++) {
            // decrease count by one in char array for each char
            charCount[str2.charAt(i)]--;
            // if char count is less than 0 return false
            if (charCount[str2.charAt(i)] < 0) {
                return false;
            }
        }
        // return true after loops since it's a permutation
        return true;
    };

    // main method
    public static void main(String[] args) {
        System.out.println(isPermutationCharArray("words", "sword"));
    }
}
