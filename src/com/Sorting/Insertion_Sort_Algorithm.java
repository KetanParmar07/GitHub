package com.Sorting;

import java.util.Arrays;

public class Insertion_Sort_Algorithm {
    public static void main(String[] args) {

        int[] arr = new int[10];

        System.out.print("Generated random Array is= ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));

        Insertion_Sort(arr);

        System.out.print("Sorted Array is= ");
        System.out.println(Arrays.toString(arr));
    }
    static void Insertion_Sort(int[] arr){
        // here i loop will be run [N(arr.length) - 1] and i = no. of pass
        for (int i = 0; i < arr.length-1; i++) {
            // here j loop will be start always i+1 and check if index(i+1) to index greater than zero if any value is smaller than it's previous value then swap with it's previous greater value.
            // here j loop will run also j > 0
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }
    static void swap(int[] arr, int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }
}
