package com.company;
class calculate1{
    public void BMI(double w,double h){
        double b=(h*h)/w;
        System.out.println(b);
    }
}
public class FP8 {
    public static void main(String[] args) {
        calculate1 obj=new calculate1();
        obj.BMI(75,170);
    }
}
