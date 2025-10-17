package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**

    You are given two 2D integer arrays, items1 and items2, representing two sets of items. 
    Each array items has the following properties:

        items[i] = [valuei, weighti] where valuei represents the value and weighti represents the weight of the ith item.
        The value of each item in items is unique.

    Return a 2D integer array ret where ret[i] = [valuei, weighti], 
    with weighti being the sum of weights of all items with value valuei.

    Note: ret should be returned in ascending order by value.


    Example 1:

    Input: items1 = [[1,1],[4,5],[3,8]], items2 = [[3,1],[1,5]]
    Output: [[1,6],[3,9],[4,5]]

 */
public class MergeSimilarItems {
 
    // Time: O(n)
    // merge similar items using map
    public static List<List<Integer>> mergeSimilarItemsMap (int[][] items1, int[][] items2) {
        // init list of list of integer
        List<List<Integer>> list = new ArrayList<>();
        // init map of integer, integer
        Map<Integer, Integer> map = new TreeMap<>();
        
        // for each items in items1
        for (int[] items : items1) {
            // in map put items at 0, map or get default items at 0, 0 plus items at 1
            map.put(items[0], map.getOrDefault(items[0], 0) + items[1]);
        }

        // for each items in items2
        for (int[] items : items2) {
            // in map put items at 0, map or get default items at 0, 0 plus items at 1
            map.put(items[0], map.getOrDefault(items[0], 0) + items[1]);
        }

        // for each item in map key set
        for (int key : map.keySet()) {
            // to list add new arraylist of key, map get key
            list.add(new ArrayList<>(List.of(key, map.get(key))));
        }
        
        // return list
        return list;
    }


    // Time: O(n)
    // merge similar items using array
    public static List<List<Integer>> mergeSimilarItemsArray (int[][] items1, int[][] items2) {
        // init list of list of integer
        List<List<Integer>> list = new ArrayList<>();
        // init freqArray of size 1001
        int[] freqArray = new int[1001];

        // for each items in items1
        for (int[] items : items1) {
            // increase freqArray at items at 0 by items at 1
            freqArray[items[0]] += items[1];
        }

        // for each items in items2
        for (int[] items : items2) {
            // increase freqArray at items at 0 by items at 1
            freqArray[items[0]] += items[1];
        }

        // for each num i in freqArray
        for (int i = 0; i < freqArray.length; i++) {
            // if freqArray at i is not equal to 0
            if (freqArray[i] != 0) {
                // to list add new arrayList list of i, freqArray at i
                list.add(new ArrayList<>(List.of(i, freqArray[i])));
            }
        }

        // return list
        return list;
    }



    // main
    public static void main(String[] args) {
        int[][] items1 = {{1,1},{3,2},{2,3}};
        int[][] items2 = {{2,1},{3,2},{1,3}};
        System.out.println(mergeSimilarItemsArray(items1, items2));
    }
}
