package com.company;
import java.util.Scanner;
public class two_dim_Arry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n1 = sc.nextInt();
        System.out.println("Enter the columns:");
        int n2 = sc.nextInt();
        int[][] ar2 = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                ar2[i][j] = sc.nextInt();
            }
        }
            for (int k = 0; k < n1; k++) {
                for (int l= 0; l < n2; l++) {
                    System.out.print(ar2[k][l]+" ");
                }
                System.out.println(" ");
            }
        }
    }

