package leetcode;

import java.util.Arrays;

public class DecodeXORedArray {
    /**
     
        There is a hidden integer array arr that consists of n non-negative integers.

        It was encoded into another integer array encoded of length n - 1, 
        such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], 
        then encoded = [1,2,3].

        You are given the encoded array. You are also given an integer first, 
        that is the first element of arr, i.e. arr[0].

        Return the original array arr. It can be proved that the answer exists and is unique.

        Example 1:

        Input: encoded = [1,2,3], first = 1
        Output: [1,0,2,1]
        Explanation: If arr = [1,0,2,1], then first = 1 
                    and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]

    */

    // Time: O(n)
    // decoded XORed array using for loop
    public static int[] decode(int[] encoded, int first) {
        // initialize ans to encoded length plus 1
        int[] ans = new int[encoded.length + 1];
        // set ans at 0 to first
        ans[0] = first;
        
        // for 1 to encoded length
        for (int i = 1; i < ans.length; i++) {
            // set ans at current index to encoded at current index - 1 XOR ans at current index - 1
            ans[i] = encoded[i - 1] ^ ans[i - 1];
        }
        
        // return ans
        return ans;
    }

    // main method
    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int first = 1;
        System.out.println(Arrays.toString(decode(encoded, first)));
    }

}
