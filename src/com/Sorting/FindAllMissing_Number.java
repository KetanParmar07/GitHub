package com.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.InflaterInputStream;

import static com.Sorting.CyclicSort.swap;

public class FindAllMissing_Number {
    public static void main(String[] args) {
        int[] arr = {4,7,1,8,3,9,5,3};
        ArrayList<Integer> ans = FindAllMissing_Number(arr);
        System.out.println(ans);
    }
    static ArrayList<Integer> FindAllMissing_Number(int[] nums){
        int i = 0;
        while(i <= nums.length){
            int  correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
}
