package com.company;

public class FP44 {
    public static void main(String[] args) {
        try{
            int a=500;
            int b=0;
            double c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Failed to divide:"+e);
        }
    }
}
