package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * In this class, you're given strings jewels representing the types of stones 
 * that are jewels, and stones representing the stones you have. Each character 
 * in stones is a type of stone you have. You want to know how many of 
 * the stones you have are also jewels."
 */

public class JewelsAndStones {
    
    // Time: O(n)
    // jewels and stones using a set
    public static int jewelsAndStones (String jewels, String stones) {
        // initialize set of characters jewelSet
        Set<Character> jewelSet = new HashSet<>();
        // for each jewel in jewels
        for (int i = 0; i < jewels.length(); i ++) {
            // to jewelSet add jewels char at current index
            jewelSet.add(jewels.charAt(i));
        }
        
        // initialize jewelCount to 0
        int jewelCount = 0;
        // for each stone in stones
        for (int i = 0; i < stones.length(); i++) {
            // if jewelSet contains stones char at current index
            if (jewelSet.contains(stones.charAt(i))) {
                // increase jewelCount by 1
                jewelCount++;
            }
        }

        // return jewelCount
        return jewelCount;

        
    }

    // main method
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbb";
        System.out.println(jewelsAndStones(jewels, stones));
    }
}
