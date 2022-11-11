package com.Sorting;

import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {8,9,5,12,13,4,3,14,16,10,11,2,15,1,6,7};

        Cyclic_sort(arr);

        System.out.print("Sorted Array is= ");
        System.out.println(Arrays.toString(arr));
    }
   static void Cyclic_sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }

}
