package com.company;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
public class writer {
    public static void main(String args[]) throws Exception{
        //Instantiating the FileOutputStream class
        FileOutputStream fileOut = new FileOutputStream("D:\\File1.txt");
        //Instantiating the DataOutputStream class
        DataOutputStream outputStream = new DataOutputStream(fileOut);
        outputStream.writeChar(7);
        outputStream.flush();
        System.out.println("Data entered into the file");
    }
}