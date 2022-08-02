package com.company;

public class DSA_42 {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4};
        System.out.println(check(arr));
    }
    public static int check(int[] arr){
        int unique=0;
        for(int i :arr){
            unique=unique^i;
        }
        return unique;
    }
}
