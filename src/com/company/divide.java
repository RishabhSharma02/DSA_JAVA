package com.company;

public class divide {
    public static void main(String[] args) {
        System.out.println(check(-3,7));
    }
    public static int check(int divisor,int dividend){
        if(divisor>Integer.MAX_VALUE || dividend>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        } else if (divisor<Integer.MIN_VALUE || dividend<Integer.MIN_VALUE)         {
            return Integer.MIN_VALUE;
        }
        int c=0;
        while(dividend>=Math.abs(divisor)){
            dividend=dividend-Math.abs(divisor);
            c=c+1;
        }
        if(divisor<0 || dividend<0){
            return 0-c;
        }
        else{
            return c;
        }
    }
}
