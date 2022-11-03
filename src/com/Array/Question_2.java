package com.Array;

import java.util.Arrays;

public class Question_2 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        System.out.print("Generate Random Array:- ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));

        int ans1 = max(arr);
        System.out.println("The Maximum value in Array is= "+ans1);

        int ans = max1(arr,3,8);
        System.out.println("The Maximum value in Array is= "+ans);
    }

    // find maxvalue in range in array
    static int max1(int[] arr, int start, int end){
        int maxvalue = Integer.MIN_VALUE;

        if (end > start){
            return -1;
        }
        if (arr.length == 0){
            return -1;
        }

        for (int i = start; i < end; i++) {
            if (arr[i] > maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }

    // imagine Array is not empty
    static int max(int[] arr){
        int maxvalue = arr[0];

        if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
}
