package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Two_D_Array {
    public static void main(String[] args) {

        /*
           1 2 3
           4 5 6
           7 8 9
         */

        int[][] arr2D = new int[3][3];

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Array Element:- ");

        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }
    }
}
