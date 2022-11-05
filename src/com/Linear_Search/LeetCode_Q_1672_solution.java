package com.Linear_Search;

import java.util.Arrays;

public class LeetCode_Q_1672_solution {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];

        System.out.println("Generated random Array:- ");
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                arr1[row][col] = (int) (Math.random()*100);
            }
            System.out.println(Arrays.toString(arr1[row]));
        }

        int ans = maximumWealth(arr1);
        System.out.println("The total bank accounts of Richest person is= "+ans);
    }

    // check every person how many bank account and print the sum of all bank account
    static int maximumWealth(int[][] accounts){
        // person = row
        // account = col
        // checke_every_person_bank_account_sum and return the heighest value.

        int /* checke_every_person_bank_account_sum = ans  */ ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            // sum the every person bank account

            int rowsum =  0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowsum += accounts[person][account];
            }
            System.out.println("The "+(person + 1)+" person"+" total bank account is= "+rowsum);
            if (ans < rowsum){
                ans = rowsum;
            }
        }
        return ans;
    }
}
