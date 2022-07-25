package com.company;

import java.util.Scanner;

public class prob_3 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age=sc.nextInt();
        switch (age) {
            case 18 -> System.out.println("You are going to be adult !");
            case 26 -> System.out.println("You are going to get a job!");
            case 36 -> System.out.println("Enjoy your life");
            default -> System.out.println("Invalid choice");
        }
    }

}