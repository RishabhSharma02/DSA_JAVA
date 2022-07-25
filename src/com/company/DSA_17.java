package com.company;

public class DSA_17 {
    public static int ans(int[] arr,int tgt){
        int peak=peakIndexInMountainArray(arr);
        int ft=binarysearch(arr,tgt,0,peak);
        if(ft!=-1){
            return ft;
        }
        return binarysearch(arr,tgt,peak+1,arr.length-1);
    }
    public static int peakIndexInMountainArray(int[] arr) {
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
        return start;
    }
    public static int binarysearch(int[] arr,int tgt,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(tgt==arr[mid]){
                return mid;
            }
            if(arr[start]<arr[end]) {
                if (tgt < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (tgt > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}

