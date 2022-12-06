package com.Sorting;

import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = new int[10];

        System.out.print("Generated random Array is= ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));

        arr = mergeSort(arr);

        System.out.print("Sorted Array is= ");
        System.out.println(Arrays.toString(arr));
    }
    // here first function for mergeSort call recursive manner
    static int[] mergeSort(int[] arr){
        // here if condition is check the array length is one then return the that value
        if (arr.length == 1){
            return arr;
        }

        // here find the mid value
        int mid = arr.length / 2;

        // here create the left part of array and right part of array for sort the array value
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); // here recursive call is made
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length)); // here recursive call is made

        return merge(left,right);
    }

    static int[] merge(int[] left, int[] right) {
        // here create the another mix array to store the both left and right sub part of the array in sorted manner
        int[] mixArray = new int[left.length + right.length]; // here mixArray size is left part of Array + right part of Array.
        /*
            here create the three variable i, j, k
            here i -> left part of array first index
                 j -> right part of array first index
                 k -> mixArray of array first index
         */

        int i = 0;
        int j = 0;
        int k = 0;

        // here while loop check (i< left.length) and (j < right.length) both condition are true then while loop execute
        // while loop run then first if condition is check for both left part of array and right part of in which index value is small that value is store in the mixArray inn sorted manner
        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                mixArray[k] = left[i];
                i++;
            }else {
                mixArray[k] = right[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < left.length){
            mixArray[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length){
            mixArray[k] = right[j];
            j++;
            k++;
        }
        return mixArray;
    }


}
