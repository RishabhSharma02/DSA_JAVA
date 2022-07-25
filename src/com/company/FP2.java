package com.company;
class Baser{
    public void printer(){
        System.out.println("Baser");
    }
}
class Baser1 extends Baser{
    public void printer1(){
        System.out.println("Baser1");
    }
}
public class FP2 {
    public static void main(String[] args) {
     Baser1 obj=new Baser1();
     obj.printer1();
     obj.printer();
    }
}
