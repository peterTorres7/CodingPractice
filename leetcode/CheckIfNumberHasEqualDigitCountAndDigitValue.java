package leetcode;

import java.util.HashMap;
import java.util.Map;

/**

    You are given a 0-indexed string num of length n consisting of digits.

    Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num, 
    otherwise return false.
    

    Example 1:

    Input: num = "1210"
    Output: true
    Explanation:
    num[0] = '1'. The digit 0 occurs once in num.
    num[1] = '2'. The digit 1 occurs twice in num.
    num[2] = '1'. The digit 2 occurs once in num.
    num[3] = '0'. The digit 3 occurs zero times in num.
    The condition holds true for every index in "1210", so return true.

 */

public class CheckIfNumberHasEqualDigitCountAndDigitValue {
   
    // Time: 0(n)
    // check if number has equal digit count and digit value using map
    public static boolean checkIfNumberHasEqualDigitCountAndDigitValueMap (String num) {
        // init map of Integer, Integer
        Map<Integer, Integer> map = new HashMap<>();
        
        // for each char in num
        for (char c : num.toCharArray()) {
            // init currentNum to c - '0'
            int currentNum = c - '0';
            // in map put currentNum, map get or default char, 0 plus 1
            map.put(currentNum, map.getOrDefault(currentNum, 0) + 1);
        }

        // for each num i in num length
        for (int i = 0; i < num.length(); i++) {
            // init currentNum to num char at i - '0'
            int currentNum = num.charAt(i) - '0';
            // if currentNum is not equal to map get or default i, 0
            if (currentNum != map.getOrDefault((i), 0)) {
                // return false
                return false;
            }
        }

        // return true
        return true;
    }


    // Time: O(n)
    // check if number has equal digit count and digit value using array
    public static boolean checkIfNumberHasEqualDigitCountAndDigitValueArray (String num) {
        // init freqArray of size 11
        int[] freqArray = new int[11];

        // for each char in num
        for (char c : num.toCharArray()) {
            // init currentNum to char - '0'
            int currentNum = c - '0';
            // increase freqArray at currentNum by 1
            freqArray[currentNum]++;
        }

        // for each num i in num length
        for (int i = 0; i < num.length(); i++) {
            // init currentNum to num char at i minus '0'
            int currentNum = num.charAt(i) - '0';
            // if current num is not equal to freqArray at i
            if (currentNum != freqArray[i]) {
                // return false
                return false;
            }
        }

        // return true
        return true;
    }



    // main
    public static void main(String[] args) {
        String num = "1210";
        System.out.println(checkIfNumberHasEqualDigitCountAndDigitValueArray(num));
    } 
}
