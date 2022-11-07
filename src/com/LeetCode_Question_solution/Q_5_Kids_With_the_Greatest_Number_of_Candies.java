package com.LeetCode_Question_solution;

import java.util.ArrayList;
import java.util.List;

public class Q_5_Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
       int[] candies = {2,3,5,1,3};
       // Here candies array index represent the KIDS OF NO.
       // Index = no. 1 kids, no. 2 kids, no. 3 kids, no. 4 kids, no. 5 kids
       /*
          2 = no. 1 kids of candies
          3 = no. 2 kids of candies
          5 = no. 3 kids of candies
          1 = no. 4 kids of candies
          3 = no. 5 kids of candies
        */
       int extraCandies = 3;
       List<Boolean> ans = kidsWithCandies(candies,extraCandies);
       System.out.println("The result Array is= "+ans);

    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Initialize maximum element
        int max = candies[0];

        // Traverse array elem to find the highest number
        for (int i = 1; i < candies.length; i++)
            if (candies[i] > max) {
                max = candies[i];
            }
        //Initialize output list
        List<Boolean> output = new ArrayList<>();

        //Loop through each elem to set output[i] to true or false, depending on the sum of candies[i] and extraCandies

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies < max) {
                output.add(false);
            } else {
                output.add(true);
            }
        }
        //finally, return the output list
        return output;
    }
}
