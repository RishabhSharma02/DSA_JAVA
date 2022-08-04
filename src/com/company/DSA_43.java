package com.company;

public class DSA_43 {
    public static void main(String[] args) {

    }
    //XOR from 0 to a
    public static int xor(int n){
        if(n%4==0){
            return n;
        }
        if(n%4==1){
            return 1;
        }
        if(n%4==2) {
            return n+1;
        }
        return 0;

    }
}
