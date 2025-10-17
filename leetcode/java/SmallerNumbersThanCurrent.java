package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
    Given the array nums, for each nums[i] find out how many numbers in the array 
    are smaller than it. That is, for each nums[i] you have to count the number of valid j's 
    such that j != i and nums[j] < nums[i].

    Return the answer in an array.

    Example 1:

    Input: nums = [8,1,2,2,3]
    Output: [4,0,1,1,3]
 */

public class SmallerNumbersThanCurrent {

    // Time: O(n^2)
    // smaller numbers than current using brute force
    public static int[] smallerNumbersThanCurrentBruteForce (int[] nums) {
        // initialize ansArray to nums length
        int[] ansArray = new int[nums.length];
        // for each num in nums
        for (int i = 0; i < nums.length; i++) {
            // initialize smaller count to 0
            int smallerCount = 0;
            // for each num in nums
            for (int j = 0; j < nums.length; j++) {
                // if nums at j index is less than nums at i index
                if (nums[j] < nums[i]) {
                    // increase smaller count by 1
                    smallerCount++;
                }
            }
            // after inner loop set ansArray at i index to smaller count
            ansArray[i] = smallerCount;
        } 
        
        //return ansArray
        return ansArray;
    }

    // Time: O(nlogn)
    // smaller numbers than current using sort
    public static int[] smallerNumbersThanCurrentSort (int[] nums) {
        // initialize numsClone to nums clone
        int[] numsClone = nums.clone();
        // sort numsClone
        Arrays.sort(numsClone);

        // initialize numsMap
        Map<Integer, Integer> numsMap = new HashMap<>();
        // for each num in numsClone
        for (int i = 0; i < numsClone.length; i++) {
            // if numsMap doesn't contain key numsClone at current index
            if (!numsMap.containsKey(numsClone[i])) {
                // in numsMap put numsClone at current index and current index
                numsMap.put(numsClone[i], i);
            }
        }
        
        // for each num in nums
        for (int i = 0; i < nums.length; i++) {
            // set nums at current index to numsMap get nums at current index
            nums[i] = numsMap.get(nums[i]);
        }

        // return nums
        return nums;
    }

    // Time: O(n)
    // smaller numbers than current using frequency array
    public static int[] smallerNumbersThanCurrentArray (int[] nums) {
        // initialize frequency array to 101
        int[] frequencyArray = new int[101];
        // for each num in nums
        for (int num : nums) {
            // increase frequency array at num by 1
            frequencyArray[num]++;
        }
        
        // for each num in frequency array starting at 1
        for (int i = 1; i < frequencyArray.length; i++) {
            // set frequency array at current index to plus/equal frequency array at current index - 1
            frequencyArray[i] += frequencyArray[i - 1];
        }

        // for each num in nums
        for (int i = 0; i < nums.length; i++) {
            // if nums at current index is equal to 0
            if (nums[i] == 0) {
                // set nums at current index to 0
                nums[i] = 0;
            } else {
                // else set nums at current index to frequency at nums at current index - 1
                nums[i] = frequencyArray[nums[i] - 1];
            }
        }

        // return nums
        return nums;
    }

    // main method
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrentArray(nums)));
    }
}
