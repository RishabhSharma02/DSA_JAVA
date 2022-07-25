package com.company;

public class java_throw_throws {
    public static int divide(int a,int b) throws ArithmeticException{
        int c=a/b;
        return c;
    }
    public static void main(String[] args) {
        try {
            int d = divide(4, 0);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This will execute");
        }
    }
}
