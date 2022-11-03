package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        int[] arr = new int[10];


        System.out.print("Generate Random Array:- ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));

        System.out.print("Array index swap:- ");
        swap(arr,5,7);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
