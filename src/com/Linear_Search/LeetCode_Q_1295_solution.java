package com.Linear_Search;

import java.util.Arrays;

public class LeetCode_Q_1295_solution {
    public static void main(String[] args) {
        int[] arr = new int[30];

        System.out.println("Generated random Array:- ");
        for (int row = 0; row < arr.length; row++) {
                arr[row] = (int) (Math.random()*1000/9);
        }
        System.out.println(Arrays.toString(arr));

        int ans = findNumbers(arr);
        System.out.println("The total Even digits number is= "+ans);
    }

    // find how many numbers contains even digits
    static int findNumbers(int[] arr){
        int count = 0;
        for (int num : arr) {
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    // here check the number of digits is even or not
    static boolean even(int num) {
        int digitsOfNumber = digits(num);

//        if (digitsOfNumber % 2 == 0){
//            return true;
//        }
//        return false;

             // or

        return digitsOfNumber % 2 == 0;

    }

    // find the how many digits in every number
    static int digits(int num){
        if (num < 0){
            num *= -1;
        }

        if (num == 0){
            return 1;
        }

        int count = 0;
        while (num > 0){
            count++;
            num/=10;
        }
        return count;
    }
}
