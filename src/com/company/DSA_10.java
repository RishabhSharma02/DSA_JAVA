package com.company;

public class DSA_10 {
    public static int check(int[][] arr){
        int ans=Integer.MIN_VALUE;
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;
            }
            if(sum>ans){
                ans=sum;
            }
        }

    return ans;
    }
}
