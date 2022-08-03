package com.company;

public class No_of_digits {
    public static void main(String[] args) {

    }
    public static int count(int n){
        int b=2;
        int c=(int)(Math.log(n)*Math.log(b))+1;
        return c;
    }
}
