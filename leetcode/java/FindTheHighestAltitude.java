package leetcode;

/**

    There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. 
    The biker starts his trip on point 0 with altitude equal 0.

    You are given an integer array gain of length n 
    where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). 
    Return the highest altitude of a point.
    

    Example 1:

    Input: gain = [-5,1,5,0,-7]
    Output: 1
    Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

 */

public class FindTheHighestAltitude {
    
    // Time: O(n)
    // find the highest altitude
    public static int findTheHighestAltitude (int[] gain) {
        // init ans to 0
        int ans = 0;

        // init currentAlt to 0
        int currentAlt = 0;
        // for each g in gain
        for (int g : gain) {
            // set currentAlt to currentAlt plus g
            currentAlt += g;
            // if currentAlt is greater than ans
            if (currentAlt > ans) {
                // set ans to currentAlt
                ans = currentAlt;
            }
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(findTheHighestAltitude(gain));
    }
}
