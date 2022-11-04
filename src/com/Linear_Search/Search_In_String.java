package com.Linear_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Search_In_String {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name = "Ketan";

        System.out.print("Enter character:- ");
        char target = in.next().charAt(0);

        boolean ans = search_in_string(name,target);
        System.out.println("The given character present in the string= "+ans);

        int ans1 = search_in_string1(name,target);
        System.out.println("The given character present at the "+ans1+" index");

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    // check the particular character is equal to the target character
    static boolean search_in_string(String name, char target){
        if (name.length() == 0){
            return false;
        }
        // for loop for iterate through all over string array and check the target character is equal to the character
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)){
                return true;
            }
        }
        // using for-each loop
//        for (char ch : name.toCharArray()) {
//            if (ch == target){
//                return true;
//            }
//        }

        // if character is not present in the string return false
        return false;
    }

    // check the particular character is equal to the target character and return the index
    static int search_in_string1(String name, char target){
        if (name.length() == 0){
            return Integer.MIN_VALUE;
        }
        // for loop for iterate through all over string array and check the target character is equal to the character and return the index
        for (int index = 0; index < name.length(); index++) {
            if (target == name.charAt(index)){
                return index;
            }
        }
        // if character is not present in the string and return the index
        return Integer.MIN_VALUE;
    }
}
