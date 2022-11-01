package com.datatype;

public class Main {
    public static void main(String[] args) {
        int a = 45;
        float b = 43.849f;
        int c = 'k';
        short d = 25;
        byte e = 32;
        long f = 58884787901l;
        double g = 443.8319304831357;

        double ans = (a+b)/(c*d)-(e-f)*(g-a)+(a/c);
        System.out.println("This expression answer= "+ans);


    }
}
