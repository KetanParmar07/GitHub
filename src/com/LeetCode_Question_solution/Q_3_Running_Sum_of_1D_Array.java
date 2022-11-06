package com.LeetCode_Question_solution;

// URL=https://leetcode.com/problems/running-sum-of-1d-array/


import java.util.Arrays;

public class Q_3_Running_Sum_of_1D_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = runningSum(nums);
        System.out.println("The New build array is= "+ Arrays.toString(ans));
    }
    /*
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     */
    static int[] runningSum(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = nums[0];
        for(int i = 1; i < n; i++){
            ans[i] = ans[i-1] + nums[i];
        }
        return ans;
    }
}
