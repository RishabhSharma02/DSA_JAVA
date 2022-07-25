package com.company;
class A{
    public  void meth1(){
        System.out.println("I am method 1 of class A");
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }

}
class B extends A{
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
}
public class method_over {
    public static void main(String[] args) {
     A a=new A();
     a.meth1();
     a.meth2();
     B b=new B();
     b.meth2();
    }
}
