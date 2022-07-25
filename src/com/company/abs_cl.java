package com.company;
abstract class Bas{
    abstract public void greet();
    abstract public void greet2();
}
class child extends Bas{
    public void greet(){
        System.out.println("Good afternoon");
    }
    public void greet2(){
        System.out.println("Ni how");
    }
}
public class abs_cl {
    public static void main(String[] args) {
        child obj=new child();
        obj.greet();
        obj.greet2();
    }
}
