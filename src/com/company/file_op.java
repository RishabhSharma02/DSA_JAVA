package com.company;// Java program to merge two
// files into third file

import java.io.*;

public class file_op
{
    public static void main(String[] args) throws IOException
    {
        // PrintWriter object for file3.txt
        PrintWriter pw = new PrintWriter("D://file3.txt");

        // BufferedReader object for file1.txt
        BufferedReader br = new BufferedReader(new FileReader("D://file1.txt"));

        String line = br.readLine();

        // loop to copy each line of
        // file1.txt to file3.txt
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }

        br = new BufferedReader(new FileReader("D://file2.txt"));

        line = br.readLine();

        // loop to copy each line of
        // file2.txt to file3.txt
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }

        pw.flush();

        // closing resources
        br.close();
        pw.close();

        System.out.println("Merged file1.txt and file2.txt into file3.txt");
    }
}
