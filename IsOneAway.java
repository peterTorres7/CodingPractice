/**
 * This class checks to see if given two Strings, is one String 
 * one edit (replace, instert, remove) away from the other String.
 */

public class IsOneAway {
    
    //                                      
    // "ple", "pele" -> false                                     
    //  i                                    
    //                                      
    //                                      

    // isOneAway using helper methods
    public static boolean isOneAway(String str1, String str2) {
        // if lenghts are equal 
        if (str1.length() == str2.length()) {
            // return oneEditReplace method
            return (oneEditReplace(str1, str2));
        }

        // if str1 length plus 1 is equal to str2 length
        if (str1.length() + 1 == str2.length()) {
            // return oneEditInsertRemove with str1 as first parameter since it's a shorter string
            return oneEditInsertRemove(str1, str2);
        }

        // if str2 length plus 1 is equal to str1 length
        if (str2.length() + 1 == str1.length()) {
            // return oneEditInsertRemove with str2 as first parameter since it's a shorter string
            return oneEditInsertRemove(str2, str1);
        }

        // return false since diffence in lengths is bigger than one so it means more than one edit
        return false;

    } 

    // oneEditReplace helper method
    public static boolean oneEditReplace(String str1, String str2) {
        // initialize seenDifference to false
        boolean seenDifference = false;
        // loop through str1
        for (int i = 0; i < str1.length(); i++) {
            // if str1 char at current index is not equal to str2 char at current index
            if (str1.charAt(i) != str2.charAt(i)) {
                // if seenDifference is true
                if (seenDifference) {
                    // return false
                    return false;
                }
                // set seenDifference to true
                seenDifference = true;
            }
        }
        // return true after loop since only one difference
        return true;
    }

    // main method
    public static void main(String[] args) {
        System.out.println(isOneAway("pele", "pali"));
    }
}
