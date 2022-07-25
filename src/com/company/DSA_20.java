package com.company;

import java.util.Arrays;

public class DSA_20 {
    public static void main(String[] args) {
        int[] arr={1,2,5,4,6};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int end=arr.length-i-1;
            int maxindex=getmaxindex(arr,0,end);
            swapper(arr,maxindex,end);

        }
    }
    public static void swapper(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static int getmaxindex(int[] arr, int start, int end) {
        int max=start;
        for (int j = start; j < end; j++) {
            if (arr[max]<arr[j]){
                max=arr[j];
            }
            
        }
        return max;
    }
}
