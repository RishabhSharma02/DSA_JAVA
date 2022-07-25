package com.company;

public class error_prac {
    public static void main(String[] args) {
        try{
            int a=4;
            int b=0;
            int c=a/b;
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
