package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DSA_31 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8};
        findDisappearedNumbers(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int c=nums[i]-1;
            if(nums[i]!=nums[c]){
                swap(nums,i,c);
            }
            else {
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                ans.add(j+1);

            }

        }
        return ans;
    }
    public static void  swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
