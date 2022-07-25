package com.company;
import java.util.Scanner;
public class FP5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[4];
        marks[0]=45;
        marks[1]=45;
        marks[2]=45;
        marks[3]=45;

        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            double c=marks[a]/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
