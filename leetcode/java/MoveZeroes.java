import java.util.Arrays;


// Given an integer array nums, move all 0's to the end of it 
// while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.


// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        // init write
        int write = 0;
    
        // for read form 0 to nums length
        for (int read = 0; read < nums.length; read++) {
            // if nums at read is not equal to 0
            if (nums[read] != 0) {
                // set nums at write to nums at read
                nums[write] = nums[read];
                // increase write by 1
                write++;         
            }
        }
    
        // for num from write to nums length
        for (int num = write; num < nums.length; num++) {
            // set nums at num to 0
            nums[num] = 0;
        }
    }
    
    // main
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    
        // print
        System.out.println(Arrays.toString(nums));
    }
}

