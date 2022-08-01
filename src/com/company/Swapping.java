package com.company;

import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        swapper(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swapper(int[] arr){
        if(arr.length%2==0) {
            for (int i = 0; i < arr.length - 1; i += 2) {
                swap(arr, i, i + 1);
            }
        }
        else {
            for (int i = 0; i < arr.length - 2; i += 2) {
                swap(arr, i, i + 1);
            }
        }
    }

    private static void swap(int[] arr,int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
