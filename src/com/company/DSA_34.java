package com.company;

public class DSA_34 {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap65(nums,i,correct);
            }
            else {
                i++;
            }

        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=nums[j+1]){
                return new int[] {nums[j],j+1};
            }

        }
        return new int[] {-1,-1};

    }
    public void swap65(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;


    }
}
