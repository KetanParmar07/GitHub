package com.LeetCode_Question_solution;

import java.util.Arrays;

// URL=https://leetcode.com/problems/shuffle-the-array/
public class Q_4_Shuffle_the_Array {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = shuffle(nums,n);
        System.out.println("The New build array is= "+ Arrays.toString(ans));

    }
    /*
        Input: nums = [2,5,1,3,4,7], n = 3
        Output: [2,3,5,4,1,7]
        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
     */
    static int[] shuffle(int[] nums, int n){
        // Method 1 for solution

        // int[] ans = new int[2*n];
        // int j = 0;
        // for(int i=0; i<2*n; i+=2){
        //     ans[i] = nums[j];
        //     ans[i+1] = nums[j+n];
        //     j++;
        // }
        // return ans;

        // Method 2 for decreasing the space complexity.
        // optimal solution for reduce the space complexity
        for(int i=0; i<n; i++){
            nums[i+n] += nums[i]*10000;
        }

        for(int i=0; i<n; i++){
            nums[2*i] = nums[i+n]/10000;
            nums[(2*i)+1] = nums[i+n]%10000;
        }
        return nums;
    }
}
