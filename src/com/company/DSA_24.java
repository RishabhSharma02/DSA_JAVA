package com.company;

public class DSA_24 {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
        System.out.println(BS(arr,4,0,arr.length-1));
    }
    static int BS(int[] arr,int tgt,int s,int e){
        int mid=s+(e-s)/2;
        if(s>e){
            return -1;
        }
        if(arr[mid]==tgt){
            return mid;
        }
        if(tgt<arr[mid]){
            return BS(arr,tgt,s,mid-1);
        }
        return BS(arr,tgt,mid+1,e);
    }
}
