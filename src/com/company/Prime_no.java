package com.company;

public class Prime_no {
    public static void main(String[] args) {
    factors(20);
    }
    public static void factors(int n){
        for (int i = 1; i *i<=n ; i++) {
            if(n%i==0){
                if(n%i==i) {
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i+" "+n/i+" ");
                }
            }

        }
    }
}
