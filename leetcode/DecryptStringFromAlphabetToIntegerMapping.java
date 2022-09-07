package leetcode;

/**

    You are given a string s formed by digits and '#'. 
    We want to map s to English lowercase characters as follows:

        Characters ('a' to 'i') are represented by ('1' to '9') respectively.
        Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.

    Return the string formed after mapping.

    The test cases are generated so that a unique mapping will always exist.


    Example 1:

    Input: s = "10#11#12"
    Output: "jkab"

*/

public class DecryptStringFromAlphabetToIntegerMapping {
    
    // Time: O(n)
    // decrypt string from alphabet to integer mapping
    public static String decryptStringFromAlphabetToIntegerMapping (String s) {
        // init stringbuilder ans 
        // init map of string and char
        // init num to 1

        // for each char 'a' to 'z'
        // if num is greater than or equal to 10
        // in map put num plus "#", char
        // increase num by 1
        // else in map put num, char
        // increase num by 1

        // init sPointer to 0
        // init stringbuilder subS to ""
        // while sPointer is less than s length
        // if sPointer is less than s length minus 2 AND s char at sPointer plus 2 is equal to '#'
        // set subS to s substring from sPointer to sPointer plus 3
        // to ans append map get subS
        // increase sPointer by 3
        // else set subS to s substring from sPointer to sPointer plus 1
        // to ans append map get subS
        // increase sPointer by 1
    }


    // main
    public static void main(String[] args) {
    
    }
}
