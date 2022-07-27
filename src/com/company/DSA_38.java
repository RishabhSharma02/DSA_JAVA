package com.company;

import java.util.Arrays;

public class DSA_38 {
    public static void main(String[] args) {
        int[] arr={4,5,6,1,2,3};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void insertion_sort(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }


    }
}
