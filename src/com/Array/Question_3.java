package com.Array;

import java.util.Arrays;

public class Question_3 {
    public static void main(String[] args) {

        int[] arr = new int[5];

        System.out.print("Generate Random Array:- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));

        reverse(arr);

        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
