package leetcode;

import java.util.Arrays;

/**

    You are assigned to put some amount of boxes onto one truck. 
    You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:

        numberOfBoxesi is the number of boxes of type i.
        numberOfUnitsPerBoxi is the number of units in each box of the type i.

    You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. 
    You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.

    Return the maximum total number of units that can be put on the truck.
    

    Example 1:

    Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
    Output: 8

 */

public class MaximumUnitsOnATruck {
    
    // Time: O(nlogn)
    // maximum units on a truck using sort
    public static int maximumUnitsOnATruckSort (int[][] boxTypes, int truckSize) {
        // init ans to 0
        int ans = 0;
        // sort boxTypes based on capacity
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        
        // for each boxType in boxTypes
        for (int[] boxType : boxTypes) {
            // if truckSize is greater than 0
            if (truckSize > 0) {
                // init possible to min of truckSize, boxType at 0
                int possible = Math.min(truckSize, boxType[0]);
                // increase ans by possible times boxType at 1
                ans += possible * boxType[1];
                // decrease truckSize by possible
                truckSize -= possible;
            } else {
                // else return ans
                return ans;
            }
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[][] boxTypes = {{1,3},{2,2},{3,1}};
        int truckSize = 4;
        System.out.println(maximumUnitsOnATruckSort(boxTypes, truckSize));
    }
}
