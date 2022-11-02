package com.methods;

public class variable_shadowing {
    static int x = 4;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 5; // here the top level variable x is shadowded by the main level block..
        System.out.println(x);
        value();

    }

    static void value() {

        System.out.println(x);
    }
}
