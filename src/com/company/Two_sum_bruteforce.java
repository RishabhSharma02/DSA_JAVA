package com.company;

import java.util.Arrays;

public class Two_sum_bruteforce {
    public static void main(String[] args) {
        int[] nums={3,2,4};
        System.out.println(Arrays.toString(search(nums,6)));

    }
    public static int[] search(int[] nums,int tgt){
        int[] ans=new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            int a=nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int b=nums[j];
                if (a+b==tgt){
                    ans[0]=i;
                    ans[1]=j;
                }

            }


        }
        return ans;
    }
}

