package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Array:- Basically array is collection of same data item

              syntax:-
              data_type[] variable_name = new data_type[size];
         */

        int[] arr = new int[5];
        // or
        int[] arr1; // declaration of array. arr is getting defined in the stack.
        arr1 = new int[3]; // actually here object is being created in the memory(heap).

        String[] name = new String[5];

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name:- ");

        for (int i = 0; i < name.length; i++) {
            name[i] = in.next();
        }

        // print name using for loop
//        for (int i = 0; i < name.length; i++) {
//            System.out.print(name[i]+" ");
//        }

        // print name array using for-each loop
//        for (String ans: name) {
//            System.out.print(ans+" ");
//        }

        // print name array using Array.toString method
        System.out.println(Arrays.toString(name));
        name[3] = "xyz";
        System.out.println(Arrays.toString(name));

    }
}
