package com.company;

public class prog_2 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            int c=a/b;
        }
        catch (ArithmeticException e){
            System.out.println("haha");
        }
        catch(IllegalArgumentException e){
            System.out.println("Hehe");
        }
    }
}
