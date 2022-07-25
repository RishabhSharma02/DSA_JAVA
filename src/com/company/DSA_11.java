package com.company;

public class DSA_11 {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7,8,9};
        int tg=8;
        int c;
        c = binarysearch(ar,tg);
        System.out.println("INDEX NO.-"+c);
    }
    public static int binarysearch(int[] arr ,int tgt){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(tgt==arr[mid]){
            return mid;
        }
        else if(tgt<arr[mid]){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return -1;

    }
}
