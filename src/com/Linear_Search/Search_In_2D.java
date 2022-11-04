package com.Linear_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Search_In_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.print("Enter target element:- ");
        int target = in.nextInt();

        System.out.println("Generate Random Array:- ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (int) (Math.random()*100);
            }
            System.out.println(Arrays.toString(arr[row]));
        }


        int[] ans = search(arr,target);
        System.out.println("The target element index:- "+Arrays.toString(ans));
    }

    // search in 2D Array
    static int[] search(int[][] arr, int target){
        int ans = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr.length == 0){
                    return new int[]{-1,-1};
                }

                if (ans == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
