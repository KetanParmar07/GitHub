package com.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr ={-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 16;

        int ans = Binary_search(arr, target);
        System.out.println("The target element index is= "+ans);

    }
    // find the target element is the exists in the array or not using Binary search Algorithm
    static int Binary_search(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            // find the middle element
            /*
            mid = (start+end)/2 -> here start+end  might be exists the integer range
             */
            int mid = start+(end-start)/2; // mid = start+(end-start)/2 => (2start + end-start)/2 => (start+end)/2

            // check the target element is greater than the middle element, or small the middle element
            if (target == mid){
                return mid;
            }

            if (target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;

    }
}
