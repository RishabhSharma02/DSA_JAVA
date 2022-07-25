package com.company;

import java.util.Arrays;

public class DSA_7 {
    public static void main(String[] args) {
        int[][] aRR={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        search(aRR,10);

    }
    public static void search(int arr[][],int tgt){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==tgt){
                    int[] arr1={row,col};
                    System.out.println(Arrays.toString(arr1));
                }
                else {
                    continue;
                }

            }

        }
    }
}
