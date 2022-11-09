package com.Sorting;

import java.util.Arrays;

public class Selection_Sort_Algo {
    public static void main(String[] args) {
        int[] arr = new int[10];

        System.out.print("Generated random Array is= ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));

        Selection_sort(arr);

        System.out.print("Sorted Array is= ");
        System.out.println(Arrays.toString(arr));
    }
    static void Selection_sort(int[] arr){

        // run this loop n-1 times and here i = pass how many pass will used for array is sorted
        for (int i = 0; i < arr.length; i++) {

            int lastIndex = arr.length-i-1; // here we find the last index form the remain array. Initially remain array = full complete array and then next remain array is equal to the left part of the array which is unsorted

            int maxIndex = getMaxIndex(arr,0,lastIndex); // here getMaxIndex Method return the maximum value at which index that index will be return this method

            swap(arr, maxIndex,lastIndex);// here swap method will be swap maxIndex and lastIndex so last-left part will be sorted.
        }
    }
    static void swap(int[] arr, int maxIndex, int lastIndex) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
