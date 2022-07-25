package com.company;
class A1{
    public void meth1(){
        System.out.println("Hello");
    }
}
class A2 extends A1{
    public void meth1(){
        System.out.println("Hello ! 2");
    }
    public void meth2(){
        System.out.println("Hello ! 3");
    }
}
public class dynmethdis {
    public static void main(String[] args) {
       A1 obj=new A2();
       A2 obj1 =new A2();
       obj.meth1();
       obj1.meth2();
    }
}
