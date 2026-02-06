import java.util.Arrays;

// Given an integer array nums sorted in non-decreasing order, 
// remove some duplicates in-place such that each unique element appears at most twice. 
// The relative order of the elements should be kept the same.

// Since it is impossible to change the length of the array in some languages, 
// you must instead have the result be placed in the first part of the array nums. 
// More formally, if there are k elements after removing the duplicates, 
// then the first k elements of nums should hold the final result. 
// It does not matter what you leave beyond the first k elements.

// Return k after placing the final result in the first k slots of nums.

// Do not allocate extra space for another array. 
// You must do this by modifying the input array in-place with O(1) extra memory.


// Example 1:

// Input: nums = [1,1,1,2,2,3]
// Output: 5, nums = [1,1,2,2,3,_]

public class RemoveDuplicatesII {
    public static int removeDuplicatesII(int[] nums) {
        // if nums length is less than 3
        if (nums.length < 3) {
            // return nums length
            return nums.length;
        }

        // init write to 2
        int write = 2;

        // for read from 2 to nums length
        for (int read = 2; read < nums.length; read++) {
            // if nums at read is not equal to nums at write minus 2
            if (nums[read] != nums[write - 2]) {
                // set nums at write to nums at read
                nums[write] = nums[read];
                // increase write by 1   
                write++;  
            }
        }

        // return write
        return write;
    }

    //main
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};

        System.out.println(removeDuplicatesII(nums));
    }
}