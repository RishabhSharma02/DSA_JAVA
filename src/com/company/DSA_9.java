package com.company;

public class DSA_9  {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1};
        check(arr);
    }
    public static void check(int[] arr){
        int[] ans =new int[arr.length];
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            c=c+arr[i];
            ans[i]=c;
        }
    }
}
