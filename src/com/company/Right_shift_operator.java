package com.company;

public class Right_shift_operator {
    public static void main(String[] args) {
        System.out.println(check(5));

    }
    public static boolean check(int n){
        return ((n&1)==1);
    }
}
