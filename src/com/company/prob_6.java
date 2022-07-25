package com.company;

public class prob_6 {
    static void logic(int x, int y) {
        if (x > y) {
            System.out.println("A is greater than B");
        } else {
            System.out.println("B is greater than A");
        }
    }

    public static void main(String[] args) {
        int A = 3;
        int B = 4;
        int C = 6;
        int D = 5;
        logic(A, B);
        logic(C, D);
    }
}
