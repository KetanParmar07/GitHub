package com.LeetCode_Question_solution;

// URL=https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;

public class Q_2_Concatenation_of_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] ans = getConcatenation(nums);
        System.out.println("The New build array is= "+ Arrays.toString(ans));
    }
    /*
        Input: nums = [1,2,1]
        Output: [1,2,1,1,2,1]
        Explanation: The array ans is formed as follows:
        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
        - ans = [1,2,1,1,2,1]
     */

    static int[] getConcatenation(int[] nums){
        int n=nums.length;
        int[]ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}
