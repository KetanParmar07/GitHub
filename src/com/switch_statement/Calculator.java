package com.switch_statement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("This Program is Calculator..");
        System.out.println("");
        System.out.print("Enter the Mathematical singh for any opertion:- ");
        char ch = in.next().trim().charAt(0);

        System.out.print("Enter num1: ");
        double num1 = in.nextFloat();
        System.out.print("Enter num2: ");
        double num2 = in.nextFloat();

        switch (ch) {
            case '+':
                System.out.println("The Sum of Two number is=" + (num1 + num2));
                break;

            case '-':
                System.out.println("The Subtraction of Two number is=" + (num1 - num2));
                break;

            case '*':
                System.out.println("The Multiplication of Two number is=" + (num1 * num2));
                break;

            case '/':
                System.out.println("The Division of Two number is=" + (num1 / num2));
                break;

            case '%':
                System.out.println("The Modulo of Two number is=" + (num1 % num2));
                break;

            case '^':
                System.out.println("The Power of the number is="+(Math.pow(num1,num2)));
                break;

            default:
                System.out.println("Enter Valid Mathematical singh....");
        }

    }
}
