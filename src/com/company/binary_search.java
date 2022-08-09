package com.company;

public class binary_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(search(arr,3));

    }
    public static int search(int[] arr,int tgt){
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (tgt == arr[mid]) {
                return mid;
            }
            if (tgt > arr[mid]) {
                start = mid + 1;

            }
            end = mid - 1;
        }
        return -1;
    }
}
