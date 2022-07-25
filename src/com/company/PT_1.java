package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class PT_1 {
    public static void main(String[] args) {
    pattern6(5);
    }
    public static void pattern1(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n1){
        for (int row = 1; row <= n1; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n2){
        for (int row = 1; row <= n2; row++) {
            for (int col = n2; col >=row ; col--) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n3){
        for (int row = 1; row <= n3; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n4){
        for (int row = 0; row <= 2* n4; row++) {
            int colf=row>n4 ? 2*n4-row-1 : row;
                for (int col = 1; col <=colf;col++){
                    System.out.print("* ");
                }

            System.out.println();
        }
    }
    public static void pattern6(int n5){
        for (int row = 1; row <=n5; row++) {
            for (int space = 0; space < n5-row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col+" ");

            }
            System.out.println();
        }
    }
    public static void pattern7(int n6){
        for (int row = 0; row < n6; row++) {


        }
    }
}
