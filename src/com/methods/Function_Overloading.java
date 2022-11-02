package com.methods;

public class Function_Overloading {
    public static void main(String[] args) {

        int ans = sum(64,84);
        System.out.println("The sum of two number is= "+ans);

        int ans1 = sum(5,87,673);
        System.out.println("The sum of three number is= "+ans1);
    }
    static int sum(int num1, int num2){

        System.out.println("The average of two number is= "+((num1+num2)/2));
        return num1+num2;
    }

    static int sum(int num1, int num2, int num3){

        System.out.println("The average of three number is= "+((num1+num2+num3)/3));
        return num1+num2+num3;

    }
}
