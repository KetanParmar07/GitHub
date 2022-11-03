package com.methods;

import java.util.Arrays;

public class Var_args_methods {
    public static void main(String[] args) {

        fun(1,2,3,4,5,6,7,8,9);
        multiple(2,3,"Ketan","Kelvin","Dipesh","xyz");
    }

    // multiple arguments in function
    static void multiple(int a, int b, String ...name){
        System.out.println("The value of a is= "+a);
        System.out.println("The value of b is= "+b);
        System.out.println(Arrays.toString(name));
    }

    static void fun(int ...arr){

        System.out.println(Arrays.toString(arr));
    }
}
