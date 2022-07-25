package com.company;
class Myclass<T>{
    T ob;
    public void Mycl(T ob){
        this.ob=ob;
    }
    public void show(){
        System.out.println(ob.getClass().getName());

    }
}
public class Generic_3 {
    public static void main(String[] args) {
        Myclass<Integer> gen= new Myclass<Integer>();
        gen.Mycl(21);
        gen.show();
    }
}
