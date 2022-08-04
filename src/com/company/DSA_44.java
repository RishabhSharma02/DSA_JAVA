package com.company;

public class DSA_44 {
    public static void main(String[] args) {

    }
    public static int[][] reverser(int[][] image){
        for(int[] a:image){
            for (int i = 0; i < (image.length+1)/2; i++) {
                  int temp=a[i]^1;
                  a[i]=a[image.length-i-1]^1;
                a[image.length-i-1]=temp;
            }
        }
        return image;
    }
}
