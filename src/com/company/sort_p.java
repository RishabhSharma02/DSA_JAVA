package com.company;

import java.util.Arrays;

public class sort_p {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,i,j);
                }

            }

        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;

    }
}
