package com.company;

public class DSA_8 {
    public static void main(String[] args) {
        int arr[]={1,12,3,455,3214};
        evendigits(arr);
    }
    public static void evendigits(int[] arr){
        int c=0;
        for (int i:arr){
            String s=i+"";
            int len=s.length();
            if(len%2==0){
                c=c+1;
            }
        }
        System.out.println(c);
    }
}
