package com.company;

public class sum_pascal_triangle {
    public static void main(String[] args) {
        System.out.println(count(4));
        System.out.println(check(4));

    }
    public static int count(int n){
        return 1<<n-1;
    }
    public static boolean check(int n){
        if ((n&n-1)==0){
            return true;
        }
        else {
            return false;
        }
    }
}
