package com.company;

public class DSA_16 {
    public int findInMountainArray(int[] arr) {
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return binarysearch(arr,start);

    }
    public static int binarysearch(int[] arr ,int tgt){
        int end=arr.length-1;
        while(tgt <=end){
            int mid= tgt +(end- tgt)/2;
            if(tgt ==arr[mid]){
                return mid;
            }
            else if(tgt <arr[mid]){
                end=mid-1;
            }
            else{
                tgt =mid+1;
            }
        }
        return -1;

    }
}
