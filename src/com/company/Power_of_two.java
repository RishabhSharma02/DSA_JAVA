package com.company;

public class Power_of_two {
    public static void main(String[] args) {
        System.out.println(check(5));

    }
    public static boolean check(int n){
        for (int i = 0; i < 31; i++) {
            if(Math.pow(2,i)==n){
                return true;
            }

        }
        return false;
    }
}
