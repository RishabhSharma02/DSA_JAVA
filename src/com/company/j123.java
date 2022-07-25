package com.company;
class base1{
    base1(){

        System.out.println("Base 1 without argument running");
    }
    base1(int x,int y){
        System.out.println("Value of x is: "+x+""+y);
    }
}
class derived  extends base1
{
 derived(){
     System.out.println("Derived constructor");
 }
 derived(int a,int b){
     System.out.println("Value of a :"+a);
 }
}
public class j123 {
    public static void main(String[] args) {
        base1 obj=new base1();
        base1 obj1=new base1(4,5);
        derived obj2=new derived(4,9);
    }
}