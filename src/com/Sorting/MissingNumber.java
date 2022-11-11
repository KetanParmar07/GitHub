package com.Sorting;

import static com.Sorting.CyclicSort.swap;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        int ans = MissingNumber(arr);
        System.out.println(ans);
    }
    static int MissingNumber(int[] nums){
        int i = 0;
        while (i < nums.length){
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        // case 2
        return nums.length;
    }
}
