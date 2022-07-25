package com.company;
abstract class cl1{
    public void greet(){
        System.out.println("Good morning");
    }
    public void greet2(){
        System.out.println("Good evening");
    }
    abstract public void greet3();
        }
class cl2 extends cl1{
    @Override
    public void greet3() {
        System.out.println("helo");
    }
}

public class abstr {
    public static void main(String[] args) {
        cl2 obj=new cl2();
        obj.greet();
        obj.greet2();
        }
    }

