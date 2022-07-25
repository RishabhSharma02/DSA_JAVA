package com.company;
import java.io.*;
import java.util.Scanner;


public class Creater {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File myfile = new File("D://Myfile.txt");
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                String s = sc.next();
                System.out.println(s);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
