package com.methods;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int a = 5;
        int b = 78;

//        // swap two number code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a,b);
        System.out.println(a+" "+b);

        String name = "Ketan";
        changename(name);
        System.out.println(name);

        int[] arr = {11,22,33,44,55};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changename(String name) {
        name = "Kelvin";
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }


    // array of zero index will be change via change method because here pass the value of the reference variable reference
    static void change(int[] a){
        a[0] = 99;
    }
}
