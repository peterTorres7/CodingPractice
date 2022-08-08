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
    
    // Time: O(n*m)
    // sum of all odd length subarrays using brute force
    public static int sumOfAllOddLengthSubarraysBruteForce (int[] arr) {
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

    // Time: O(n)
    // sum of all odd length subarrays using for loop
    public static int sumOfAllOddLengthSubarrays (int[] arr) {
        // init sum to 0
        int sum = 0;

        // for each num in arr length
        for (int i = 0; i < arr.length; i++) {
            // init start to i + 1
            int start = i + 1;
            // init end to arr length - i
            int end = arr.length - i;
            // init totalSubs to start times end
            int totalSubs = start * end;
            // init oddSubs to totalSubs even? totalSubs / 2 else totalSubs / 2 + 1
            int oddSubs = totalSubs % 2 == 0 ? totalSubs / 2 : totalSubs / 2 + 1;
            // to sum add oddSubs * arr at i
            sum += oddSubs * arr[i];
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
