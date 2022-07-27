package com.company;

import java.util.Arrays;

public class DSA_37 {
    public static void main(String[] args) {
        int[] arr={3,6,542,3,3556,234};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void selection_sort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            int temp=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
        arr[i]=arr[min];
            arr[min]=temp;

        }
    }
}
