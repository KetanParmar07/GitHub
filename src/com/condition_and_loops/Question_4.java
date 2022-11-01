package com.condition_and_loops;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number in which do you want to count digit: ");
        int num = in.nextInt();

        System.out.print("Enter digit which do you search in number: ");
        int n = in.nextInt();

        int count = 0;
        while (num > 0){
            int rem = num % 10;
            if (rem == n){
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
