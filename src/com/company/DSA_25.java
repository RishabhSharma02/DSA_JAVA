package com.company;

public class DSA_25 {
    public static void main(String[] args) {
        System.out.println(sumdgt(1342));
    }
    public static void disp(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        disp(n-1);
    }
    public static void dispR(int n){
        if(n==0){
            return;
        }
        dispR(n-1);
        System.out.print(n);

    }
    public static int fact(int n){
        if(n==0){
            return 0;
        }
    return n+fact(n-1);
    }
    public static int sumdgt(int n){
        if(n==0){
            return 0;
        }
        int c=0;
        c=n/10;
        return c+sumdgt(n);
    }

}
