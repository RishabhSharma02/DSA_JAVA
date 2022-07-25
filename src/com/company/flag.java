package com.company;
import java.util.Scanner;
class calculate{
    public void cl1(int x,int y,int z){
        float ar1=x*y;
        float ar2=z*z;
        float num=ar1/ar2;
        System.out.println(num);
    }
}
public class flag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        calculate obj=new calculate();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        obj.cl1(a,b,c);
    }
}
