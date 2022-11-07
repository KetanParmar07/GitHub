package com.LeetCode_Question_solution;

// URL=https://leetcode.com/problems/number-of-good-pairs/

import java.util.Arrays;

public class Q_6_Numbers_of_good_pairs {
    public static void main(String[] args) {

        int[] arr = {1,1,1,1};
        System.out.println("Array is= "+Arrays.toString(arr));

        int ans = goodPairs(arr);
        System.out.println("The Good pairs is= "+ans);
    }
    /* Example :- 1
        Input: nums = [1,2,3,1,1,3]
        Output: 4
        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

       Example :- 2
        Input: nums = [1,1,1,1]
        Output: 6
        Explanation: Each pair in the array are good.
     */
    static int goodPairs(int[] nums){

        int goodpairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {

                // A pair (i, j) is called good if nums[i] == nums[j] and i < j.
                if (nums[i] == nums[j] && i<j){
                    goodpairs++;
                }
            }
        }
        return goodpairs;
    }
}
