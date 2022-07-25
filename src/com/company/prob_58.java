package com.company;
import java.io.File;
import java.util.Scanner;

public class prob_58 {
    public static void main(String[] args) {
        File myfile=new File("My_first_file.txt");
        try {
           Scanner sc=new Scanner(myfile);
           while(sc.hasNextLine()){
               String line= sc.nextLine();
               System.out.println(line);
           }
           sc.close();
        }
        catch (Exception e){
            System.out.println("Unable to write"+e);
        }
    }
}
