import java.util.Arrays;

// Given an integer array nums, 
// move all the even integers at the beginning of the array followed by all the odd integers.

// Return any array that satisfies this condition.
 

// Example 1:

// Input: nums = [3,1,2,4]
// Output: [2,4,3,1]

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        // init left read
        int leftRead = 0;
        // init right read
        int rightRead = nums.length - 1;

        // while left read is less than right read
        while (leftRead < rightRead) {
            // if nums at left read is odd and nums at right read is even
            if (nums[leftRead] % 2 != 0 && nums[rightRead] % 2 == 0) {
                // set temp to nums at left read
                int temp = nums[leftRead];
                // set nums at left read to nums at right read
                nums[leftRead] = nums[rightRead];
                // set nums at right read to temp
                nums[rightRead] = temp;
                // increase left read by 1
                leftRead++;
                // decrease right read by 1            
                rightRead--;    
            }
            // else if nums at left read is even
            else if (nums[leftRead] % 2 == 0) {
                // increase left read by 1
                leftRead++;
            }
            // else 
            else {
                // decrease right read by 1            
                rightRead--;
            }
        }
        
        // return nums
        return nums;
    }

    //main
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.print(Arrays.toString(sortArrayByParity(nums)));
    }
}

// time: O(n)
// space: O(1)