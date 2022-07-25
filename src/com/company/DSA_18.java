package com.company;

public class DSA_18 {
    public static int search(int[] nums, int target) {
          int pivot=pivot(nums) ;
          if(pivot==-1){
              return binarysearch(nums,target,0, nums.length-1);
          }
          if(nums[pivot]==target){
              return pivot;
          }
          if(target>=nums[0]){
              return binarysearch(nums,target,0,pivot-1);
          }
          else {
              return binarysearch(nums,target,pivot+1, nums.length-1);
          }
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
    public static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
