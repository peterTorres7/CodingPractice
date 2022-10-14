package leetcode;

import java.util.Arrays;

/**

    You are given an integer array prices where prices[i] is the price of the ith item in a shop.

    There is a special discount for items in the shop. If you buy the ith item, 
    then you will receive a discount equivalent to 
    prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i]. 
    Otherwise, you will not receive any discount at all.

    Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, 
    considering the special discount.
    

    Example 1:

    Input: prices = [8,4,6,2,3]
    Output: [4,2,4,2,3]

 */

public class FinalPricesWithASpecialDiscountInAShop {
    
    // Time: O(nm)
    // final prices with a special discount in a shop
    public static int[] finalPricesWithASpecialDiscountInAShop (int[] prices) {
        // init ans to new int array of prices length
        int[] ans = new int[prices.length];
        // init left to 0
        int left = 0;

        // while left is less than prices length
        while (left < prices.length) {
            // set ans at left to prices at left
            ans[left] = prices[left];
            // for each price i plus left to prices length
            for (int i = left + 1; i < prices.length; i++) {
                // if prices at left is greater or equal to prices at i
                if (prices[left] >= prices[i]) {
                    // set ans at left to prices at left minus prices at i
                    ans[left] = prices[left] - prices[i];
                    // break
                    break;                        
                }
            }
            // after for loop increase left by 1
            left++;
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        System.out.println(Arrays.toString(finalPricesWithASpecialDiscountInAShop(prices)));
    }
}
