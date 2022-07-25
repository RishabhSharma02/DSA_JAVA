package com.company;
import java.util.Scanner;
public class error_java {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        try {
            int d=9/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("B Exception occured");
        }
        catch (ArithmeticException e){
            System.out.println("A exception occured");
        }
    }
}