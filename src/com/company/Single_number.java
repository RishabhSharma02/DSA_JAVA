package com.company;

import java.util.Arrays;

public class Single_number {
    public static void main(String[] args) {
    int[] arr={4,1,2,1,2};
        Arrays.sort(arr);
        System.out.println(find((arr)));
    }
    public static int find(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                continue;
            }
            else {
                return nums[i];
            }

        }
        return -1;

    }
}
