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

    }

    // search any element position in array
    static int Linear_Search(int[] arr, int target){

        // here traverse the whole array and compare the all array value with target.
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
