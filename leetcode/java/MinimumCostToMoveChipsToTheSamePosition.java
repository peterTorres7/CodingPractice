package leetcode;

/**

    We have n chips, where the position of the ith chip is position[i].

    We need to move all the chips to the same position. 
    In one step, we can change the position of the ith chip from position[i] to:

        position[i] + 2 or position[i] - 2 with cost = 0.
        position[i] + 1 or position[i] - 1 with cost = 1.

    Return the minimum cost needed to move all the chips to the same position.

    

    Example 1:

    Input: position = [1,2,3]
    Output: 1

 */

public class MinimumCostToMoveChipsToTheSamePosition {
    
    // Time: O(n)
    // minimum cost to move chips to the same position
    public static int minimumCostToMoveChipsToTheSamePosition (int[] position) {
        // init even to 0
        int even = 0;
        // init odd to 0
        int odd = 0;

        // for each p in position
        for (int p : position) {
            // if p is even
            if (p % 2 == 0) {
                // increase even by 1
                even++;
            } else {
                // else increase odd by 1
                odd++;
            }
        }

        // return min of even, odd
        return Math.min(even, odd);
    }



    // main
    public static void main(String[] args) {
        int[] position = {1, 2, 3};
        System.out.println(minimumCostToMoveChipsToTheSamePosition(position));
    }
}
