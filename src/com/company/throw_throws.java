package com.company;
import java.util.Scanner;

public class throw_throws {
    public static float div(int a,int b){
        float c=a/b;
        return c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(d==0){
            throw new ArithmeticException();
        }
        div(c,d);
    }


}
