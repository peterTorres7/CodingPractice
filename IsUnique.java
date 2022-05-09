import java.util.Arrays;

/**
 * This class checks to see it a String has all unique characters.
 */

public class IsUnique {                                               

    // Time = O(n^2)
    // Space = O(1)
    // isUnique using brute force
    public static boolean isUniqueBruteForce(String str) {

        // create out loop of str with 2 less than length
        for (int i = 0; i < str.length() - 1; i++) {
            // create inner loop of str starting at i + 1
            for (int j = i + 1; j < str.length(); j++) {
                // if char in inner loop is equal to char in outer loop return false
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        // after loops return true since it's unique
        return true;
    };

    // Time: O(n log(n))                                                                                                 
    // isUnique using sort
    public static boolean isUniqueSort(String str) {
        
        //initialize a char array using str
        char[] characters = str.toCharArray(); 
        // sort char array
        Arrays.sort(characters);

        // loop through characters until length - 1
        for (int i = 0; i < characters.length - 1; i++) {
            // if char at current index is equal to chart at current index plus 1 return false
            if (characters[i] == characters[i + 1]) {
                return false;
            }
        }
        //return true after loop since it's unique
        return true;
    };
                                                                                                                                 
    // Time = O(n)
    // Space = O(1)                                                    
    // isUnique using boolean array
    public static boolean isUniqueBooleanArray(String str) {
        // if str length is greater than 128 return false since at least one char is ascii is repeated
        if (str.length() > 128) {
            return false;
        }

        // initialize boolean array to size of 128 for ascii representation
        boolean[] booleanCharArray = new boolean[128];
        // loop through str chars
        for (int i = 0; i < str.length(); i++) {
            // initialize int char index
            int charIndex = str.charAt(i);
            // if boolean array at char index is true return false since char is already seen 
            if (booleanCharArray[charIndex]) {
                return false;
            }
            // change boolean array at index to true since it hasn't been seen
            booleanCharArray[charIndex] = true;
        }
        // return true after loop since it's unique
        return true;
    }

    // main method
    public static void main(String[] args) {
        String words = "words";
        System.out.println(isUniqueBooleanArray(words));
    }
    
}