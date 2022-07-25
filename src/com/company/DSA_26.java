package com.company;

public class DSA_26 {
    public static void main(String[] args) {
    int ans=sumd(1342);
        System.out.println(ans);
    }
    static int sumd(int n){
        if(n%10==n){
            return n;
        }
    return (n%10)*sumd(n/10);
    }

}
