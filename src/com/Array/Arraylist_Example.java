package com.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_Example {
    public static void main(String[] args) {

        // syntax of an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>(10);

//        list.add(76);
//        list.add(7674);
//        list.add(700);
//        list.add(7633);
//        list.add(77);
//        list.add(1176);
//        list.add(1876);
//        list.add(8476);
//        list.add(4676);
//        list.add(776);
//        list.add(7236);
//        list.add(736);
//        list.add(7316);
        Scanner in = new Scanner(System.in);

        // input using for loop
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        list.remove(3);
        System.out.println(list);
        list.set(1,6);
        // list.clear();

        System.out.println(list);
    }
}
