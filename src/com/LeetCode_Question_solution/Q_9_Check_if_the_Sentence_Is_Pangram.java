package com.LeetCode_Question_solution;

public class Q_9_Check_if_the_Sentence_Is_Pangram {
    public static void main(String[] args) {
        String sentence = "qwertyuiopasdfghhjklmnbvcxz";
        boolean answer = ans(sentence);
        System.out.println(answer);
    }
    static boolean ans(String sentence){

        // here we create the new boolean array this array size = 26 and it's initially value is equal to the false
        boolean[] arr = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            // here we particular index character check and put in the correct index position and that value is equal to the true
            // here we put character in array with a to z manner

           arr[sentence.charAt(i)- 'a'] = true;
        }
        for (int i = 0; i < 26; i++) {
            // here we check array of particular index value = false then return false  because this sentence is not pangram

            if (!arr[i]  /* (arr[i] == false) == !arr[i] */){
                return false;
            }
        }
        return true;
    }
}
