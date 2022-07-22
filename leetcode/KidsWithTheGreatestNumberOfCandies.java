package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
    There are n kids with candies. You are given an integer array candies, where each candies[i] 
    represents the number of candies the ith kid has, and an integer extraCandies, 
    denoting the number of extra candies that you have.

    Return a boolean array result of length n, where result[i] is true if, 
    after giving the ith kid all the extraCandies, they will have 
    the greatest number of candies among all the kids, or false otherwise.

    Note that multiple kids can have the greatest number of candies.

    Example 1:

    Input: candies = [2,3,5,1,3], extraCandies = 3
    Output: [true,true,true,false,true] 
    Explanation: If you give all extraCandies to:
    - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
    - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
    - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
    - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
    - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

 */

public class KidsWithTheGreatestNumberOfCandies {
    
    // Time: O(n)
    // kids with greatest number of candies using for loop
    public static List<Boolean> kidsWithTheGreatesNumberOfCandies (int[] candies, int extraCandies) {
        // initialize maxCandies to 0
        int maxCandies = 0;
        // for each candie in candies
        for (int candie : candies) {
            // if candie is greater than or equal to maxCandies
            if (candie >= maxCandies) {
                // set maxCandies to candie
                maxCandies = candie;
            }
        }

        // initialize candiesList to new array list
        List<Boolean> candiesList = new ArrayList<>();
        // for each candie in candies
        for (int candie : candies) {
            // if candie plus extraCandies is greater than or equal to maxCandies
            if (candie + extraCandies >= maxCandies) {
                // to candiesList add true
                candiesList.add(true);
            } else {
                // else to candiesList add false
                candiesList.add(false);
            }
        }

        // return candiesList
        return candiesList;
    }

    // main method
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithTheGreatesNumberOfCandies(candies, extraCandies));
    }
    
}
