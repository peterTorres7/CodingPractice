/**
 * This class checks to see if given two Strings, is one String 
 * one edit (replace, instert, remove) away from the other String.
 */

public class IsOneAway {                                   

    // Time: O(n)
    // isOneAway using helper methods
    public static boolean isOneAwayHelperMethods (String str1, String str2) {

        // if str1 length is equal to str2 length
        if (str1.length() == str2.length()) {
            return isOneReplaceAway(str1, str2);
        }

        // if str1 length is one less than str2 length
        if (str1.length() + 1 == str2.length()) {
            return isOneInsertRemoveAway(str1, str2);
        }

        // if str2 length is one less than str1 length
        if (str2.length() + 1 == str1.length()) {
            return isOneInsertRemoveAway(str2, str1);
        }

        return false;

    }

    // isOneReplaceAway since both string are equal length
    public static boolean isOneReplaceAway(String str1, String str2) {
        // initialze differenceSeen to false
        boolean diffenceSeen = false;
        // loop through str1
        for (int i = 0; i < str1.length(); i++) {
            // if str1 char at current index is not equal to str2 char at current index 
            if (str1.charAt(i) != str2.charAt(i)) {
                // if differenceSeen is true return false since more than one difference
                if (diffenceSeen) { 
                    return false; 
                }
                // set diffenceSeen to true
                diffenceSeen = true;
            }
        }
        // after loop return true since only one replace away
        return true;
    }

    // isOneInsertRemoveAway using shorter string as first parameter
    public static boolean isOneInsertRemoveAway(String str1, String str2) {
        // loop through str1
        for (int i = 0; i < str1.length(); i++) {
            // if str1 char at current index is not equal to str2 at current index
            if (str1.charAt(i) != str2.charAt(i)) {
                // if str1 char at current index is not equal to str2 at current index plus 1
                if (str1.charAt(i) != str2.charAt(i + 1)) {
                    // return false
                    return false;
                }
            }
        }
        // return true after loop since only one insert/remove away 
        return true;
    }

    // isOneInsertRemoveAway using indexes and while loop
    public static boolean isOneInsertRemoveAwayIndexes(String str1, String str2) {
        // initialize str1 index to 0
        int str1Index = 0;
        // initialize str2 index to 0
        int str2Index = 0;
        // while str1Index is less than str1 length
        while (str1Index < str1.length() && str2Index < str2.length()) {
            // if str1 char at str1Index is not equal to str2 char at str2Index
            if (str1.charAt(str1Index) != str2.charAt(str2Index)) {
                // if str1Index is not equal to str2Index return false
                if (str1Index != str2Index) {
                    return false;
                }
                // increase str2Index
                str2Index++;
            // else
            } else {
                // increase str1Index
                str1Index++;
                // increase str2Index
                str2Index++;
            }
        }
        // return true after loop since only one insert/remove away
        return true;
    }

    // main method
    public static void main(String[] args) {
        System.out.println(isOneAwayHelperMethods("plp", "palp"));
    }
}
                                                 