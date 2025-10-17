package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    /**
    Given two arrays of integers nums and index.
    Your task is to create target array under the following rules:

    Initially target array is empty.
    From left to right read nums[i] and index[i], 
    insert at index index[i] the value nums[i] in target array.
    Repeat the previous step until there are no elements to read in nums and index.

    Return the target array.

    */

public class CreateTargetArrayInTheGivenOrder {

    // Time: O(n)
    // create target array in the given order using list
    public static int[] createTargetArrayInTheGivenOrder (int[] nums, int[] index) {
        // init arrayList aList
        List<Integer> aList = new ArrayList<>();

        // for each num in nums length
        for (int i = 0; i < nums.length; i++) {
            // to aList add index at current index, nums at current index
            aList.add(index[i], nums[i]);
        }

        // init int array target array
        int[] targetArray = new int[aList.size()];
        
        // for each num in targetArray
        for (int i = 0; i < targetArray.length; i++) {
            // set ans at current index to aList get current index
            targetArray[i] = aList.get(i); 
        }

        //return targetArray
        return targetArray;
    }

    // main method
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArrayInTheGivenOrder(nums, index)));
    }
}
