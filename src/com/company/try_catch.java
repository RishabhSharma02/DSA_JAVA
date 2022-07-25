package com.company;

public class try_catch {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            float c = a / b;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
