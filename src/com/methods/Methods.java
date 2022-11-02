package com.methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // sum();
        int ans = sum2();
        System.out.println("The sum of two number is= "+ans);
        System.out.println("---------------------------------------------");

        String message = message();
        System.out.println(message);
        System.out.println("*********************************************");

        int ans2 = sum3(2,2);
        System.out.println("The sum of two number= "+ans2);
        System.out.println("---------------------------------------------");

        String print = message1("Ketan");
        System.out.println(print);
        System.out.println("*********************************************");

    }
    /*
    methods syntax:-

    access_modifire return_type name(arguments){
        //body
        return statement;
    }
    */

    static String message1(String name){
        String word = "Hello "+name+" How are you??";
        return word;
    }

    // return type with arguments
    static int sum3(int a, int b){
        return a+b;
    }

    // return type string
    static String message(){

        String greeting = "How are you??";
        return greeting;
    }

    // return value in method
    static int sum2(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1:- ");
        int num1 = in.nextInt();

        System.out.print("Enter number 2:- ");
        int num2 = in.nextInt();

        return num1+num2;

//        System.out.println("This statement never reachable");
    }

    static void sum(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1:- ");
        int num1 = in.nextInt();

        System.out.print("Enter number 2:- ");
        int num2 = in.nextInt();

        int ans = num1+num2;
        System.out.println("The sum of two number= "+ans);
    }
}
