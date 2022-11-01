package com.condition_and_loops;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("small-letter");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital-letter");
        }else {
            System.out.println("Enter valid character..");
        }
    }
}
