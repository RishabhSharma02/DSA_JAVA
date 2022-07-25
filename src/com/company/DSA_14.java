package com.company;

public class DSA_14 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int tgt=4;
        System.out.println(range(arr,tgt));



    }
    public static int range(int[] arr,int tgt){
        int start=0;
        int end=1;
        while(tgt>arr[end]){
            int newStart=end+1;
            int newEnd=end+(end-start+1)*2;
            start=newStart;
        }
   return binarysearch(arr,tgt,start,end);

    }
    public static int binarysearch(int[] arr ,int tgt,int start,int end){
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
