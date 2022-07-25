package com.company;
class Employee{
    int id;
    String name;
}
public class custom_class {
    public static void main(String[] args){
        Employee obj=new Employee();
        obj.id=1233;
        obj.name="Rishabh";
        System.out.println(obj.id);
        System.out.println(obj.name);
    }
}
