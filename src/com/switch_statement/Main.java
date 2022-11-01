package com.switch_statement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter fruit name:- ");
        String fruit = in.nextLine();

        switch (fruit){
            case "Mango":
                System.out.println("King of fruit..");
                break;

            case "Orange":
                System.out.println("small green or black fruit..");
                break;

            case "Apple":
                System.out.println("Red fruit..");
                break;

            case "Stroberry":
                System.out.println("small Red fruit..");
                break;

            default:
                System.out.println("Enter valid fruit..");
        }


    }
}
