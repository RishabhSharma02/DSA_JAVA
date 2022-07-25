package com.company;
import java.io.*;
public class ByteInputStream {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fis = new FileInputStream("My_first_file.txt");
            int i=0;
            while((i=fis.read())!=-1){
                System.out.print((char) i);
            }
            fis.close();
        }
        catch (Exception e){
            System.out.println("Unable to read");
        }
    }
}
