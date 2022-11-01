package com.condition_and_loops;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a salary:- ");
        int salary = in.nextInt();

        // check the condition if salary is greater than 10000 or 20000 or 5000.

        if (salary > 20000){
            salary += 3000;
        } else if (salary > 10000) {
            salary += 2000;
        }else {
            salary += 1000;
        }

        System.out.println("The New salary of every employee= "+salary);
    }
}
