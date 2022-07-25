package com.company;

public class varargs {
    static int oper(int ...arr){
        int sum=0;
        for(int a: arr){
            sum=sum+a;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(+oper(2,5));
        System.out.println(+oper(3,4));
    }
}
