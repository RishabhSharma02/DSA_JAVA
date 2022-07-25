package com.company;
abstract class pen{
    public void write(){
        System.out.println("Writing");
    }
    public void refill(){
        System.out.println("Refilling");
    }
}
class pen2 extends pen{}

public class prob1 {
    public static void main(String[] args) {
        pen2 obj=new pen2();
        obj.write();
        obj.refill();
    }
}
