package com.company;
abstract class monkey {
    public void jump()

    {
        System.out.println("jumping");
    }

    public void bite()
    {
        System.out.println("Biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class monkey2 extends monkey implements BasicAnimal{
      public void eat(){
          System.out.println("Eat");
      }
      public void sleep(){
          System.out.println("Sleep");
      }
}
public class prob3 {
    public static void main(String[] args) {
        monkey2 obj=new monkey2();
        obj.eat();
        obj.sleep();
        obj.bite();
        obj.jump();
    }
}
