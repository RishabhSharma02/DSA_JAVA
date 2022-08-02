package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fizz_Buzz {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new List[]{fizzbuzz(15)}));
    }
    public static List<String> fizzbuzz(int n){
        ArrayList<String> arrayList=new ArrayList();
        for (int i = 1; i <=n; i++) {
            if(i%3==0 && i%5==0){
                arrayList.add("FizzBuzz");
            } else if (i%3==0) {
                arrayList.add("Fizz");
            } else if (i%5==0) {
                arrayList.add("Buzz");
            }
            else{
                arrayList.add(Integer.toString(i));
            }

        }
        return arrayList;
    }
}
