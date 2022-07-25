package com.company;
class A11{
    public void meth1(){
        System.out.println("Hello m1");
    }
    public void meth2(){
        System.out.println("Hello m2");
    }
}
class B11 extends A11{
    public void meth2(){
        System.out.println("Hello m3");
    }
}
public class FP$ {
    public static void main(String[] args) {
     B11 b=new B11();
     b.meth2();
     b.meth1();
    }
}
