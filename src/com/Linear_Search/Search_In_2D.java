package com.Linear_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Search_In_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter array element:- ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
            System.out.println(Arrays.toString(arr[row]));
        }

        System.out.print("Enter target element:- ");
        int target = in.nextInt();

        int[] ans = search(arr,target);
        System.out.println("The target element index:- "+Arrays.toString(ans));

        System.out.println("---------------------------------------------------");

        int[][] arr1 = new int[3][3];

        System.out.println("Generated random Array:- ");
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                arr1[row][col] = (int) (Math.random()*100);
            }
            System.out.println(Arrays.toString(arr1[row]));
        }

        int ans1 = max(arr1);
        System.out.println("The maximum value in 2D array is= "+ans1);

        System.out.println("---------------------------------------------------");

        int[] ans2 = maxIndex(arr1);
        System.out.println("The maximum value index in 2D Array is= "+Arrays.toString(ans2));

        System.out.println("---------------------------------------------------");

        int ans3 = min(arr1);
        System.out.println("The minimum value in 2D Array is= "+ans3);

        System.out.println("---------------------------------------------------");

        int[] ans4 = minIndex(arr1);
        System.out.println("The minimum value index in 2D Array is= "+Arrays.toString(ans4));

        System.out.println("---------------------------------------------------");
    }

    // search in 2D Array
    static int[] search(int[][] arr, int target){
        if (arr.length == 0){
            return new int[]{-1,-1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // search maximum item in 2D arrayy
    static int max(int[][] arr){
        int maxvalue = Integer.MIN_VALUE;

        if (arr.length == 0){
            return -1;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > maxvalue){
                    maxvalue = arr[row][col];
                }
            }
        }
        return maxvalue;
    }

    // return maximum value index
    static int[] maxIndex(int[][] arr){

        if (arr.length == 0){
            return new int[]{-1,-1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] >= max(arr)){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // search minimum value in 2D array
    static int min(int[][] arr){
        int minValue = Integer.MAX_VALUE;

        if (arr.length == 0){
            return -1;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < minValue){
                    minValue = arr[row][col];
                }
            }
        }
        return minValue;
    }

    // return minimum value index
    static int[] minIndex(int[][] arr){
        if (arr.length == 0){
            return new int[]{-1,-1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] <= min(arr)){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
