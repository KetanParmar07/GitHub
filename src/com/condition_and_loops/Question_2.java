package com.condition_and_loops;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Which Fibonacci number you want: ");
        int num = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= num){
            int temp = b;
            b += a;
            a = temp;
            count++;
        }
        System.out.println("The Fibonacci number= "+b);
    }
}
