package com.company;

public class DSA_39 {
    public static void main(String[] args) {

    }
    public static void divide(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=ei+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,ei,si,mid);
    }

    private static void conquer(int[] arr, int ei, int si, int mid) {

    }
}
