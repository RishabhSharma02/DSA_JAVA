package com.company;
class stud{
    public void stud(int id){System.out.println("ID :"+id);}
    public void stud(String name){System.out.println("Name :"+name);}

}
public class para_conc {
    public static void main(String[] args) {
        stud obj=new stud();
        obj.stud(123);
        obj.stud("Rishabh kumar sharma");
    }

}
