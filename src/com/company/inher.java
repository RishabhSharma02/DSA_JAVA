package com.company;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class deri extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inher {
    public static void main(String[] args) {
        deri d=new deri();
        d.setX(7);
        System.out.println(d.getX());
        d.setY(6);
        System.out.println(d.getY());
    }
}
