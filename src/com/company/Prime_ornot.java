package com.company;

public class Prime_ornot {
    public static void main(String[] args) {
        System.out.println(check(30));

    }
    public static boolean check(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;

            }
            c++;
        }
        return true;
    }
}
