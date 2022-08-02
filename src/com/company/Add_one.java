package com.company;

import java.util.Arrays;

public class Add_one {
    public static void main(String[] args) {
        int[] arr={4,3,2,9};
        System.out.println(Arrays.toString(add(arr)));

    }
    public static int[] add(int[] digits){
        if(digits[digits.length-1]<9){
            digits[digits.length-1]= digits[digits.length-1]+1;
        }
        else if(digits[digits.length-1]==9){
            digits[digits.length-2]= digits[digits.length-2]+1;
            digits[digits.length-1]=0;
        }
        return digits;
    }
}
