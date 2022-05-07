/**
 * This class check to see it a String as all unique characters.
 */

public class IsUnique {                                               

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
    }


    // main method
    public static void main(String[] args) {
        String words = "words";
        System.out.println(isUniqueBruteForce(words));
    }
    
}