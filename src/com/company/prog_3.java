package com.company;

public class prog_3 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        try{
            int c=arr[5];
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
