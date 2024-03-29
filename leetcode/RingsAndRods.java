package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
There are n rings and each ring is either red, green, or blue. 
The rings are distributed across ten rods labeled from 0 to 9.

You are given a string rings of length 2n that describes the n rings that are placed onto the rods. 
Every two characters in rings forms a color-position pair that is used to describe each ring where:

    The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
    The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').

For example, "R3G2B1" describes n == 3 rings: 
a red ring placed onto the rod labeled 3, a green ring placed onto the rod labeled 2, 
and a blue ring placed onto the rod labeled 1.

Return the number of rods that have all three colors of rings on them.


Example 1:

Input: rings = "B0B6G0R6R0R6G9"
Output: 1
 */

public class RingsAndRods {
    
    // Time: O(n)
    // rings and rods using string array
    public static int ringsAndRods (String rings) {
        // init ans to 0
        int ans = 0;
        // init string array rods of length 10
        String[] rods = new String[10];

        // for each char i in rings
        for (int i = 0; i < rings.length(); i += 2) {
            // init rodsIndex to Character get numeric value of rings char at index plus 1
            int rodsIndex = Character.getNumericValue(rings.charAt(i + 1));
            // init string ring to rings char at index plus ""
            String ring = rings.charAt(i) + "";
            // if rods at rodsIndex is null
            if (rods[rodsIndex] == null) {
                // set rods at rodsIndex to ""
                rods[rodsIndex] = "";
            }
            // to rods at rodsIndex add ring
            rods[rodsIndex] += ring;
        }


        // for each rod in rods
        for (String rod : rods) {
            // if rod is not null AND rod contains "R" AND rod contains "G" AND rod contains "B"
            if (rod != null && rod.contains("R") && rod.contains("G") && rod.contains("B")) {
                // increase ans by 1
                ans++;
            }
        }

        // return ans
        return ans;
    }

    // Time: O(n)
    // rings and rods using contains
    public static int ringsAndRodsContains (String rings) {
        // init ans to 0
        int ans = 0;

        // for each 0 to 9
        for (int i = 0; i < 10; i++) {
            // if rings contains "R" + current index AND rings contains "R" + current index 
            // AND rings contains "R" + current index
            if (rings.contains("R" + i) && rings.contains("G" + i) && rings.contains("B" + i)) {
                // increase ans by 1
                ans++;
            }
        }

        // return ans by 1
        return ans;
    }

    // Time: O(n)
    // rings and rods using map
    public static int ringsAndRodsMap (String rings) {
        // init ans to 0
        int ans = 0;
        // init map
        Map<Integer, HashSet<Character>> map = new HashMap<>();
        // for each 0 to 9
        for (int i = 0; i < 10; i++) {
            // in map put index, new hashset
            map.put(i, new HashSet<Character>());
        }

        // for each char in rings
        for (int i = 0; i < rings.length(); i += 2) {
            // init mapIndex to rings char at index plus 1
            Integer mapIndex = Character.getNumericValue(rings.charAt(i + 1));
            // init color to rings char at index
            Character color = rings.charAt(i);
            // to map get mapIndex add color
            map.get(mapIndex).add(color);
        }

        // for each set in map values
        for (HashSet<Character> set : map.values()) {
            // if set size equals 3
            if (set.size() == 3) {
                // increase ans by 1
                ans++;
            }
        }

        // return ans
        return ans;
    }

    // main
    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";
        System.out.println(ringsAndRodsMap(rings));
    }
}
