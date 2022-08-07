package leetcode;

/**

    Given an array of positive integers arr, 
    return the sum of all possible odd-length subarrays of arr.

    A subarray is a contiguous subsequence of the array. 

    Example 1:

    Input: arr = [1,4,2,5,3]
    Output: 58

 */

public class SumOfAllOddLengthSubarrays {
    
    // Time O(n*m)
    // sum of all odd length subarrays using brute force
    public static int sumOfAllOddLengthSubarrays (int[] arr) {
        // init sum to 0
        int sum = 0;
        // init arraySize to 1
        int arraySize = 1;

        // while arraySize is less than or equal to arr length
        while (arraySize <= arr.length) {
            // for each num i starting at 0, if i plus arraySize is less than or equal to  arr length
            for (int i = 0; i + arraySize <= arr.length; i++) {
                // for each num j starting at i, if j is less than i plus arraySize
                for (int j = i; j < i + arraySize; j++) {
                    // to sum add arr at j 
                    sum += arr[j];
                }
            }
            // increase arraySize by 2
            arraySize += 2;
        }

        // return sum
        return sum;
    }

    // main method
    public static void main(String[] args) {
        int[] arr = new int[] {1,4,2,5,3};
        System.out.println(sumOfAllOddLengthSubarrays(arr));
        
    }
}
