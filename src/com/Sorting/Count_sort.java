package com.Sorting;
import java.util.Arrays;

public class Count_sort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n = arr.length;
        System.out.print("Generated random Array is= ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));

        count(arr,n);

        System.out.println(Arrays.toString(arr));
     }

     // find maximum value in the array and return that index
     static int max(int[] arr, int n){
         int max = arr[0];
         for (int i = 0; i < n; i++)
         {
             if (max < arr[i]){
                 max = arr[i];
             }
         }
         return max;
     }

     // here this function sort the array value
     static void count(int[] arr, int n){
         int i,j;
         int max = max(arr, n);

         // Create the count Array and Initialize the array elements to 0
         int[] count= new int[max+1];


         // Increment the corresponding index in the count array
         for (i = 0; i < n; i++)
         {
             count[arr[i]] = count[arr[i]] + 1;
         }

         i =0; // counter for count array
         j =0; // counter for given array A

         // here i <= max means index value is less then or equal to the max(means array size value) or not if it is false then while loop is break
         while(i<= max){

             /* here check the count array in particular index value is 0 or >0.
                if  it is zero then else loop will run increment the i value by 1
                if it is not zero then put that particular index in the main array and decrement the that index value by 1 that if condition is  run only that index in array value is not 0. if it is zero then condition is false and else loop will run.
             * */
             if(count[i]>0){
                 arr[j] = i;
                 count[i] = count[i] - 1;
                 j++;
             }
             else{
                 i++;
             }
         }
     }
}
