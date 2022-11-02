package com.methods;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number= ");
        double num = in.nextDouble();

        boolean ans = isPrime(num);
        System.out.println(ans);

    }
    static boolean isPrime(double num){

        if (num <= 1){
            return false;
        }

        int c = 2;
        while (c <= Math.sqrt(num)){
            if (num % c == 0){
                return false;
            }
            c++;
        }
        return c >= Math.sqrt(num);
    }
}
