package com.Sorting;

import static com.Sorting.CyclicSort.swap;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        int ans = MissingNumber(arr);
        System.out.println(ans);
    }
    static int MissingNumber(int[] nums){

        // here i is point to the array index
        int i = 0;
        while (i < nums.length){

            // here correct means index i value for correct index
            int correct = nums[i];
            if (nums[i] < nums.length /*here 1st condition check if array last index come then ignore it and move to the next condition and check*/&& nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }

        // search for first missing number
        // here check if index value is not equal to the index then return the index
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        // case 2:- here if last index number is missing then return the arr.length = last index value
        return nums.length;
    }
}
