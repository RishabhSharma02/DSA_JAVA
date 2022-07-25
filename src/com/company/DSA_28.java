package com.company;

public class DSA_28 {
    public static void main(String[] args) {
        System.out.println(count(1000));

    }
    public static int count(int n){
       return helpe1(n,0);
    }
    public static int helpe1(int n,int c){
        if(n==0){
            return c;
        }
        {
            int rem = n % 10;
            if (rem == 0){
                return  helpe1(n/10,c+1);
            }
            return helpe1(n/10,c);
        }
    }
}
