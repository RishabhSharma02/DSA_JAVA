package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class DSA3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        int i=9;
        while (i<10){
            System.out.println("Enter the no.");
            int c=sc.nextInt();
            if(i==-1){
               break;
            }
            else{
                arr[i]=c;
            }
            i--;
        }
            System.out.println(Arrays.toString(arr));
    }
}
