package com.condition_and_loops;

public class Loops {
    public static void main(String[] args) {

        /* for loop syntax:-

           for(initialization; condition; increment/decrement){
                // code
           }

         */
        int num = 5;
        System.out.println("The table of 5 is.......");

        for (int i = 0; i < 10; i++) {
            System.out.println((num)+"*"+(i+1)+ " = "+ (num*(i+1)));
        }

        /*
        while loop syntax:-

            while(condition){
                // code
            }

         */

        System.out.println("*******************************************************************");

        int num1 = 7;
        int i = 0;
        System.out.println("The table of 7 is.......");

        while (i< 10){
            System.out.println((num1)+"*"+(i+1)+ " = "+ (num1*(i+1)));
            i++;
        }

        /*
        do-while loop syntax:-

            do{
                // code
            }while(condition);

         */

        System.out.println("*******************************************************************");

        int num2 = 9;
        int j = 0;
        System.out.println("The table of 9 is.......");

        do {
            System.out.println((num1)+"*"+(j +1)+ " = "+ (num1*(j +1)));
            j++;
        }while (j < 10);


    }
}
