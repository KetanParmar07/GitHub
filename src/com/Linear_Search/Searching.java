package com.Linear_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.print("Enter target element:- ");
        int target = in.nextInt();

        System.out.print("Generate Random Array:- ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));

        int ans = Linear_Search(arr, target);
        System.out.println("The given element index= "+ans);

        int ans1 = Linear_Search2(arr,target);
        System.out.println("The target element is= "+ans1);

        boolean ans2 = Linear_Search3(arr,target);
        System.out.println("The target element in the array is= "+ans2);
    }

    // search any element position in array
    static int Linear_Search(int[] arr, int target){

        if (arr.length == 0){
            return -1;
        }
        // here traverse the whole array and compare the all array value with target.
        for (int index = 0; index < arr.length; index++) {
            if (target == arr[index]){
                return index;
            }
        }
        return -1;
    }

    // search any element in the range in array
    static int Linear_Search(int[] arr, int target, int start, int end){

        if (arr.length == 0){
            return -1;
        }
        // here traverse the whole array and compare the all array value with target.
        for (int index = start; index <= end; index++) {
            if (target == arr[index]){
                return index;
            }
        }
        return -1;
    }

    // search the target and return the element
    static int Linear_Search2(int[] arr, int target){

        if (arr.length == 0){
            return -1;
        }
        // here traverse the whole array and compare the all array value with target.
        for (int index = 0; index < arr.length; index++) {
            if (target == arr[index]){
                return target;
            }
        }
        return -1;
    }

    // search the target and return the true or false
    static boolean Linear_Search3(int[] arr, int target){

        if (arr.length == 0){
            return false;
        }
        // here traverse the whole array and compare the all array value with target.
        for (int index = 0; index < arr.length; index++) {
            if (target == arr[index]){
                return true;
            }
        }
        return false;
    }
}
