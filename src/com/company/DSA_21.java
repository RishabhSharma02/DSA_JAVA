package com.company;

import java.util.Arrays;

public class DSA_21 {
    public static void main(String[] args) {
        int[] arr={3,2,1,4,5};
        selection(arr);
    }
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
                if (min!=i){
                    swapper(arr,arr[i],arr[min]);
                }

            }

        }
    }
    public static void swapper(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
