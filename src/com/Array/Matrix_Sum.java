package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Sum {
    public static void main(String[] args) {
        // Matrix SUM, SUBTRACTION and MULTIPLICATION

        /*
            matrix 1 = [1 2 3]                matrix 2 = [1 2 3]
                       [4 5 6]                           [4 5 6]
                       [7 8 9]                           [7 8 9]
                         matrix size = 3 x 3                    matrix size = 3 x 3
                                       R1 X C1                                R2 X C2
             if both matrix row and column is same then and then matrix addition is performed
         */

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Matrix Raw value= ");
        int R1 = in.nextInt();

        System.out.print("Enter Matrix Column value= ");
        int C1 = in.nextInt();

        int[][] arr1 = new int[R1][C1];

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                arr1[row][col] = (int) (Math.random()*100);
            }
        }

        System.out.println("The First Matrix is= ");
        for (int row = 0; row < arr1.length; row++) {
            System.out.println(Arrays.toString(arr1[row]));
        }

        System.out.println("----------------------------------------");
        System.out.println();

        System.out.print("Enter Matrix Raw value= ");
        int R2 = in.nextInt();

        System.out.print("Enter Matrix Column value= ");
        int C2 = in.nextInt();

        int[][] arr2 = new int[R2][C2];

        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = (int) (Math.random()*100);
            }
        }

        System.out.println("The Second Matrix is= ");
        for (int row = 0; row < arr2.length; row++) {
            System.out.println(Arrays.toString(arr2[row]));
        }

        System.out.println("----------------------------------------");
        System.out.println();

        int[][] ans = new int[R1][C2];

        for (int i = 0; i < R1; i++) {
            for (int j = 0; j < C2; j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("The Sum of Two Matrix is = ");
        for (int row = 0; row < R1; row++) {
            System.out.println(Arrays.toString(ans[row]));
        }

    }
}
