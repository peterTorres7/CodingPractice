/**
 * This class checks to see if given two Strings, is one String 
 * a rotation of the other String.
 */

public class IsStringRotation {                         

    // assumed given isSubstring method
    public static boolean isSubstring(String str1, String str2) {
        // ....
        // ....
        return true;
    }

    // Time: O(n)
    // isStringRotation using one call to assumed isSubstring method
    public static boolean isStringRotation(String str1, String str2) {
        // initialize str1Length to str length
        int str1Length = str1.length();
        // if str1Length is not equal to str2 length AND str1Length is less than 0
        if (str1Length != str2.length() || str1Length <= 0) {
            // return false
            return false;
        }

        // initialize str1str1 = str1 + str1
        String str1str1 = str1 + str1;
        // return isSubstring using str1str1 and str2
        return (isSubstring(str1str1, str2));
        
    }
}
