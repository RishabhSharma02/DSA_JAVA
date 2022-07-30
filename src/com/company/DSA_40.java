package com.company;

public class DSA_40 {
    public static void main(String[] args) {
        System.out.println(recur(5));

    }
    public static int recur(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*recur(n-1);

    }
}
