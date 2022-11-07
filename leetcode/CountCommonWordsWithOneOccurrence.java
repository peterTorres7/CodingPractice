package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
    Given two string arrays words1 and words2, 
    return the number of strings that appear exactly once in each of the two arrays.

    

    Example 1:

    Input: words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
    Output: 2

 */

public class CountCommonWordsWithOneOccurrence {
    
    // Time: O(n) 
    // count common words with one occurrence using map
    public static int countCommonWordsWithOneOccurrence(String[] words1, String[] words2) {
        // init ans to 0
        int ans = 0;
        // init words1Map
        Map<String, Integer> words1Map = new HashMap<>();
        // init words2Map
        Map<String, Integer> words2Map = new HashMap<>();

        // for each word in words1
        for (String word : words1) {
            // in words1Map put word increasing count by 1
            words1Map.put(word, words1Map.getOrDefault(word, 0) + 1);
        }

        // for each word in words2
        for (String word : words2) {
            // in words2Map put word increasing count by 1
            words2Map.put(word, words2Map.getOrDefault(word, 0) + 1);
        }

        // for each word in words1
        for (String word : words1) {
            // if words1Map get word equals 1 AND words2Map get word equals 1
            if (words1Map.get(word) == 1 && words2Map.getOrDefault(word, 0) == 1) {
                // increase ans by 1
                ans++;
            }
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"}; 
        String[] words2 = {"amazing","leetcode","is"};
        System.out.println(countCommonWordsWithOneOccurrence(words1, words2));
    }
}
