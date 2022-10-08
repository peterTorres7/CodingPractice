package leetcode;

import java.util.Arrays;

/**

    Given an integer n, return any array containing n unique integers such that they add up to 0.


    Example 1:

    Input: n = 5
    Output: [-7,-1,1,3,4]
    Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

 */

public class FindNUniqueIntegersSumUpToZero {
    
    // Time:(n)
    // find n unique integers sum up to 0
    public static int[] findNUniqueIntegersSumUpToZero (int n) {
        // init ans to new int array of n size
        int[] ans = new int[n];

        // init num to n
        int num = n;
        // init left to 0
        int left = 0;
        // init right to n minus 1
        int right = n - 1;

        // while left is less than right
        while (left < right) {
            // set ans at left to num times -1
            ans[left] = num * -1;
            // set ans at right to num
            ans[right] = num;
            // increase left by
            left++;
            // decrease right by 1
            right--;
            // decrease num by 1
            num--;
        }

        // if n is odd
        if (n % 2 != 0) {
            // set ans at n divided by 2 to 0
            ans[n / 2] = 0;
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(findNUniqueIntegersSumUpToZero(n)));
    }
}
