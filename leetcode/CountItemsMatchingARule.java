package leetcode;

import java.util.List;

/**

    You are given an array items, where each items[i] = [typei, colori, namei] 
    describes the type, color, and name of the ith item. 
    You are also given a rule represented by two strings, ruleKey and ruleValue.

    The ith item is said to match the rule if one of the following is true:

        ruleKey == "type" and ruleValue == typei.
        ruleKey == "color" and ruleValue == colori.
        ruleKey == "name" and ruleValue == namei.

    Return the number of items that match the given rule. 

    Example 1:

    Input: items = [["phone","blue","pixel"],
                    ["computer","silver","phone"],
                    ["phone","gold","iphone"]], 
                    
                    ruleKey = "type", ruleValue = "phone"
    Output: 2

 */
public class CountItemsMatchingARule {
    
    // Time: O(n)
    // count items matching a rule using for loop
    public static int countItemsMatchingARule (List<List<String>> items, String ruleKey, String ruleValue) {
        // init ans to 0
        int ans = 0;

        // for each item in items
        for (int i = 0; i < items.size(); i++) {
            // if ruleKey equals "type" AND items get index get 0 equals ruleValue
            if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) {
                // increase ans by 1
                ans++;
            // else if ruleKey equals "color" AND items get index get 1 equals ruleValue
            } else if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) {
                // increase ans by 1
                ans++;
            // else if ruleKey equals "name" AND items get index get 2 equals ruleValue
            } else if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) {
                // increse ans by 1
                ans++;
            }
        }
        
        // return ans
        return ans;
    }

    // main method
    public static void main(String[] args) {
        List<List<String>> items = List.of(
                                        List.of("phone","blue", "pixel"), 
                                        List.of("computer","silver","phone"), 
                                        List.of("phone","gold","iphone")
                                    );
        String ruleKey = "type";
        String ruleValue = "phone";

        System.out.println(countItemsMatchingARule(items, ruleKey, ruleValue));
    }
}
