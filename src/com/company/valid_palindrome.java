package com.company;

import java.util.Arrays;

public class valid_palindrome {
    public static void main(String[] args) {
        find("A man, a plan, a canal: Panama");
    }
    public static void  find(String s){
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] array=s.toCharArray();
        String s1="";
        for (int i = array.length-1; i >=0; i--) {
            s1+=array[i];
        }
        if(s1==s){
            System.out.println("Valid");
        }
        else {
            System.out.println("Inavalid");
        }
    }
}
