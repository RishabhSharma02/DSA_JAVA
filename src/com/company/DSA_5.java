package com.company;

import java.util.Arrays;

public class DSA_5 {
    public static void main(String[] args) {
        String str="Rishabh";
        int[] arr={1,2,3,4,5,6};
        int tgt=5;
        search(arr,tgt);
        System.out.println(Arrays.toString(str.toCharArray()));
    }
    public static void search(int[] arr, int tgt){
        if(arr.length==0){
            System.out.println();
        }
        for(int i:arr){
            if(i==tgt){
                System.out.println("Found");
            }
            else {
                continue;
            }
        }
    }
}
