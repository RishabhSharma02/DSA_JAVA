package com.company;
 class student{
    int id;
    String name;
    public String getName(){
         return name;
    }
    public void setname(String n){
        name=n;
    }
     public int getID(){
         return id;
     }
     public void setId(int t){
         id =t;
     }
}
public class prog7 {
    public static void main(String[] args){
        student obj=new student();
        obj.setname("Rishabh");
        System.out.println(obj.getName());
    }

}
