package leetcode;

/**

    Given two integer arrays startTime and endTime and given an integer queryTime.

    The ith student started doing their homework at the time startTime[i] and finished it at time endTime[i].

    Return the number of students doing their homework at time queryTime. More formally, 
    return the number of students where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.
    

    Example 1:

    Input: startTime = [1,2,3], endTime = [3,2,7], queryTime = 4
    Output: 1

 */

public class NumberOfStudentsDoingHomeworkAtAGivenTime {
    
    // Time: O(n)
    // number of students doing homework at a given time
    public static int numberOfStudentsDoingHomeworkAtAGivenTime (int[] startTime, int[] endTime, int queryTime) {
        // init ans to 0
        int ans = 0;

        // for each time i in startTime length
        for (int i = 0; i < startTime.length; i++) {
            // if startTime at i is greater than or equal to queryTime AND queryTime is less than or equal to endTime at i
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                // increase ans by 1
                ans++;
            }
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[] startTime = {1,2,3}; 
        int[] endTime = {3,2,7}; 
        int queryTime = 4;
        System.out.println(numberOfStudentsDoingHomeworkAtAGivenTime(startTime, endTime, queryTime));
    }
}
