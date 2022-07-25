package com.company;
class MyClass<T>{
    T ob;
    MyClass(T ob){
       this.ob=ob;
    }
    void show(){
        System.out.println(ob.getClass().getName());
    }
}
public class Generic_2{
    MyClass<Integer> ob=new MyClass<Integer>(21);
    MyClass<Integer> ob1=new MyClass<>(234);


}
