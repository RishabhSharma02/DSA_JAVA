package com.company;

public class DSA_32 {
    public static void main(String[] args) {

    }
  public static int duplicate(int[] nums){
      int i=0;
      while(i<nums.length){
          if(nums[i]!=i+1){
              int c=nums[i]-1;
              if(nums[i]!=nums[c]){
                  swap27(nums,i,c);
              }
              else{
                  return nums[i];
              }
          }
          else {
              i++;
          }
      }
      return -1;
  }
  public static void swap27(int[] nums,int first,int second){
      int temp=nums[first];
      nums[first]=nums[second];
      nums[second]=temp;
  }
}
