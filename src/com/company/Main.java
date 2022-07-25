package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount in kilometers");
        float k= sc.nextFloat();
        float m = (float) (k * 0.621371);
        System.out.println("The amount in miles is "+m);
    }
}
