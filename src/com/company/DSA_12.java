package com.company;

public class DSA_12 {
    public static void main(String[] args) {
    int arr[]={9,8,7,6,5,4,3,2,1};
    int tg=9;
    int ans=binarysearch(arr,tg);
        System.out.println(ans);
    }
    public static int binarysearch(int[] arr,int tgt){
        int start=0;
        int end=arr.length-1;
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
