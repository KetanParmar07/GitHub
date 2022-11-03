package com.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Multi_Dimesional_ArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation of an arraylist
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add element
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                list.get(row).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
