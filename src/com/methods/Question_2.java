package com.methods;

import java.util.Scanner;

public class Question_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number= ");
        int num = in.nextInt();

        boolean ans = isArmstrong(num);
        System.out.println(ans);

        System.out.print("The 100 to 1000 between total Armstrong number= ");
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.print(i+" ");
            }
        }

    }
    static boolean isArmstrong(int num){

        int original = num;
        int ans = 0;

        while (num > 0){
            int rem = num % 10;
            ans = ans + rem*rem*rem;
            num /= 10;
        }
        return ans == original;
    }
}
