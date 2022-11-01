package com.condition_and_loops;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number:- ");
        double num = in.nextInt();
        int c = 2;

        while (c*c <= num){
            if (num % c == 0){
                System.out.println("Not Prime...");
                break;
            }
            c++;
            if (num % c != 0){
                System.out.println("Prime...");
            }
        }
    }
}
