package com.condition_and_loops;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number which you want to reverse: ");
        long num = in.nextLong();

        long ans = 0;
        while (num > 0){
            long rem = num % 10;
            ans = ans*10 + rem;
            num /= 10;
        }
        System.out.println("The Reverse number= "+ans);
    }
}
