package com.LeetCode_Question_solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_10_Count_Items_Matching_a_Rule {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> items = new ArrayList<ArrayList<String>>();
        Scanner in = new Scanner(System.in);

        items.add(new ArrayList<String>());
        items.get(0).add(0,"phone");
        items.get(0).add(1,"blue");
        items.get(0).add(2,"pixel");

        items.add(new ArrayList<String>());
        items.get(1).add(0,"computer");
        items.get(1).add(1,"silver");
        items.get(1).add(2,"lenovo");

        items.add(new ArrayList<String>());
        items.get(2).add(0,"phone");
        items.get(2).add(1,"gold");
        items.get(2).add(2,"iphone");

        System.out.println(items);
        String ruleKey = "type";
        String ruleValue = "phone";

        int ans = countMatches(items,ruleKey,ruleValue);
        System.out.println(ans);


    }
    static int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue){
        /*
            The ith item is said to match the rule if one of the following is true:

            ruleKey == "type" and ruleValue == typei.
            ruleKey == "color" and ruleValue == colori.
            ruleKey == "name" and ruleValue == namei.
            Return the number of items that match the given rule.
            
            Example 1:

            Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
            Output: 1
            Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
            
            Example 2:
            
            Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
            Output: 2
            Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
         */

        // here we define ans variable that type is int
        int ans = 0;

        // here we check if ruleKey is equals to the type/color/name(in three on of this condition is run)  then go into the List and check if particular index value is equal to the ruleValue then ans value is equal to the ans += 1 and finally return the ans value as a Final Answer

        if (ruleKey.equals("type")){
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0).equals(ruleValue)){
                    ans++;
                }
            }
        } else if (ruleKey.equals("color")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1).equals(ruleValue)){
                    ans++;
                }
            }
        }else {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2).equals(ruleValue)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
