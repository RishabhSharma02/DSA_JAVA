package com.company;
class A5{
    public void meth1(){
        System.out.println("I am method 1 of class A5");
    }
    public void meth2(){
        System.out.println("I am method 2 of class A5");
    }
}
class B5 extends A5{
    public void meth2(){
        System.out.println("I am method 2 of class B5");
    }
}
public class meth_over {
    public static void main(String[] args) {
        A5 obj=new A5();
        obj.meth1();
        obj.meth2();
        B5 obj2=new B5();
        obj2.meth2();

    }
}
