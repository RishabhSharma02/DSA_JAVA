package com.company;

public class sum_pascal_triangle {
    public static void main(String[] args) {
        System.out.println(count(4));

    }
    public static int count(int n){
        return 1<<n-1;
    }
}
