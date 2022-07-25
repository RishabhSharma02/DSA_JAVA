package com.company;
class language{
    public void displayinfo(){
        System.out.println("English language");
    }
}
class jav extends language{
    public void displayinfo(){
        System.out.println("Java language");
    }
}
public class inher_2 {
    public static void main(String[] args) {
        language obj2=new language();
        jav obj=new jav();
        obj.displayinfo();
        obj2.displayinfo();
    }
}
