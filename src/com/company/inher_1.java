package com.company;
class circle{
    int r;
    double area;
    public void ar(int r){
         area=3.14*r*r;
        System.out.println(area);
    }
}
class cylinder extends circle{
    int h;
    double s;
    public void ar2(int r,int h){
        s=2*3.14*r*h;
        System.out.println(s);
    }
}
public class inher_1 {
    public static void main(String[] args) {
        cylinder obj=new cylinder();
        obj.ar(5);
        obj.ar2(6,8);
    }
}
