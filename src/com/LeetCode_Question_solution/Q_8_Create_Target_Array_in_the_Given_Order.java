package com.LeetCode_Question_solution;

// https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.Arrays;

public class Q_8_Create_Target_Array_in_the_Given_Order {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] ans  = Arr(nums,index);
        System.out.println(Arrays.toString(ans));
    }

    /*
        Example 1:

        Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
        Output: [0,4,1,3,2]
        Explanation:
        nums       index     target
        0            0        [0]
        1            1        [0,1]
        2            2        [0,1,2]
        3            2        [0,1,3,2] here right shift 2 and new value come at 2nd index
        4            1        [0,4,1,3,2] here right shift 1 and new value come at 1st index

        Example 2:

        Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
        Output: [0,1,2,3,4]
        Explanation:
        nums       index     target
        1            0        [1]
        2            1        [1,2]
        3            2        [1,2,3]
        4            3        [1,2,3,4]
        0            0        [0,1,2,3,4]
     */
    static int[] Arr(int[] nums, int[] index){

        // target array size is equal to the index array size.
        int[] target = new int[index.length];

        for(int i=0; i<index.length;  i++){

            for(int j=target.length-1; j > index[i]; j--){
                target[j] = target[j-1];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}
