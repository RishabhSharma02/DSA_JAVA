package com.company;
abstract class abs{
   public void print(){
       System.out.println("hello");
   }
   abstract public void say();
}
class print extends abs{
    public void say(){
        System.out.println("hello 1");
    }
}
public class FP6 {
    public static void main(String[] args) {
        print obj=new print();
        obj.say();
    }
}
