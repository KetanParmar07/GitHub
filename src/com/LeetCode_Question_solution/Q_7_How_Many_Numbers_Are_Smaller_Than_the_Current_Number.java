package com.LeetCode_Question_solution;

import java.util.Arrays;

public class Q_7_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {

        int[] arr = new int[30];

        System.out.println("Generate Random Array:- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100+1);
        }
        System.out.println(Arrays.toString(arr));

        int[] ans = smallerNumbersThanCurrent(arr);
        System.out.println("The output Array is= "+Arrays.toString(ans));
    }
    /*
        Input: nums = [8,1,2,2,3]
        Output: [4,0,1,1,3]
        Explanation:
        For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
        For nums[1]=1 does not exist any smaller number than it.
        For nums[2]=2 there exist one smaller number than it (1).
        For nums[3]=2 there exist one smaller number than it (1).
        For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
     */

    static int[] smallerNumbersThanCurrent(int[] nums){

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]){
                    count++;
                    ans[i] = count;
                }
            }
        }
        return ans;
    }
}
