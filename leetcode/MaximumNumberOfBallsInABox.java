package leetcode;

import java.util.HashMap;
import java.util.Map;

/**

    You are working in a ball factory where you have n balls numbered from lowLimit up to highLimit inclusive 
    (i.e., n == highLimit - lowLimit + 1), and an infinite number of boxes numbered from 1 to infinity.

    Your job at this factory is to put each ball in the box 
    with a number equal to the sum of digits of the ball's number. 
    For example, the ball number 321 will be put in the box number 3 + 2 + 1 = 6 
    and the ball number 10 will be put in the box number 1 + 0 = 1.

    Given two integers lowLimit and highLimit, return the number of balls in the box with the most balls.


    Example 1:

    Input: lowLimit = 1, highLimit = 10
    Output: 2
    Explanation:
    Box Number:  1 2 3 4 5 6 7 8 9 10 11 ...
    Ball Count:  2 1 1 1 1 1 1 1 1 0  0  ...
    Box 1 has the most number of balls with 2 balls.

*/

public class MaximumNumberOfBallsInABox {
    
    // Time: O(n)
    // maximum number of balls in a box using map
    public static int maximumNumberOfBallsInABoxMap (int lowLimit, int highLimit) {
        // init map of integer, integer
        Map<Integer, Integer> map = new HashMap<>();
        
        // for each num i from lowLimit to including highLimit
        for (int i = lowLimit; i <= highLimit; i++) {
            // init sum to 0
            int sum = 0;
            // init currentNum to i
            int currentNum = i;
            // while currentNum is greater than 0
            while (currentNum > 0) {
                // to sum add currentNum modulo 10
                sum += currentNum % 10;
                // set currentNum to currentNum divided by 10
                currentNum /= 10;
            }
            // after while loop in map put sum, map get or default sum, 0 plus 1
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        // init max to 0
        int max = 0;
        // for each val in map values
        for (int val : map.values()) {
            // if val is greater than max
            if (val > max) {
                // set max to val
                max = val;
            }
        }

        // return max
        return max;
    }


    // Time: O(n)
    // maximum number of balls in a box using array
    public static int maximumNumberOfBallsInABoxArray (int lowLimit, int highLimit) {
        // init freqArray of size 54
        int[] freqArray = new int[54];

        // for each num i lowLimit to including highLimit
        for (int i = lowLimit; i <= highLimit; i++) {
            // init sum to 0
            int sum = 0;
            // init currentNum to i
            int currentNum = i;
            // while currentNum is greater than 0
            while (currentNum > 0) {
                // to sum add currentNum modulo 10
                sum += currentNum % 10;
                // set currentNum to currentNum divided by 10
                currentNum /= 10;
            }
            // after while loop increase freqArray at sum by 1
            freqArray[sum]++;
        }

        // init max to 0
        int max = 0;
        // for each val in freqArray
        for (int val : freqArray) {
            // if val is greater than max
            if (val > max) {
                // set max to val
                max = val;
            }
        }

        // return max
        return max;
    }



    // main 
    public static void main(String[] args) {
        int lowLimit = 1;
        int highLimit = 10;
        System.out.println(maximumNumberOfBallsInABoxArray(lowLimit, highLimit));
    }
}
