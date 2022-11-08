package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        /*
            matrix 1 = [1 2 3]                matrix 2 = [1 2 3]
                       [4 5 6]                           [4 5 6]
                                                         [7 8 9]
                         matrix size = 2 x 3                    matrix size = 3 x 3
                                       R1 X C1                                R2 X C2
               if(C1 = R2) matrix 1 column size = matrix 2 row size then and then matrix multiplication is performed

              (matrix 1) *(matrix 2) =   then answer matrix size is = R1 X C2
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

        if (C1 == R2){
            for (int row = 0; row < ans.length; row++) {
                for (int col = 0; col < ans[row].length; col++) {
                    for (int row_column = 0; row_column < C1; row_column++) {
                        ans[row][col] += arr1[row][row_column] * arr2[row_column][col];
                    }
                }
            }
            System.out.println("The Multiplication of Two Matrix is = ");
            for (int row = 0; row < R1; row++) {
                System.out.println(Arrays.toString(ans[row]));
            }
        } else {
            System.out.println("Invalid Matrix....");
        }

    }
}
