package leetcode;

/**
 * This class returns the wealth that the richest customer has from given 2d array."
 */

public class RichestCustomerWealth {
    
    // TIme: O(n^2)
    // richest customer wealth using nested loops
    public static int richestCustomerWealth(int[][] accounts) {
        // initialize maxWealth to 0
        int maxWealth = 0;
        // loop through accouts length
        for (int i = 0; i < accounts.length; i++) {
            // initiazlize currentSum to 0
            int currentSum = 0;
            // loop through accounts banks at currrent index length
            for (int j = 0; j < accounts[i].length; j++) {
                // to current sum add accounts at current index at current bank
                currentSum += accounts[i][j];
            }
            // after inner loop if currentSum is greater than maxWealth
            if (currentSum > maxWealth) {
                // set maxWealth to currentSum
                maxWealth = currentSum;
            }
        }
        // after outer loop return maxWealth
        return maxWealth;
    }

    // main method
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,1,1}};
        System.out.println(richestCustomerWealth(accounts));
    }
}
