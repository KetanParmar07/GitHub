package com.condition_and_loops;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = in.nextInt();

        System.out.print("Enter num2: ");
        int num2 = in.nextInt();

        System.out.print("Enter num3: ");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }

    }
}
