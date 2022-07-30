package com.company;

public class DSA_41 {
    public static void main(String[] args) {
        System.out.println(fibonnaci(4));

    }
    public static int fibonnaci(int n){
        if(n<2){
            return n;
        }
        return fibonnaci(n-1)+fibonnaci(n-2);

    }
}
