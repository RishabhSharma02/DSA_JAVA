package com.company;
interface Bicycle{
    void appyBrakes(int decrement);
    void speedup(int increment);
}
public class interf {
    class herocycle implements Bicycle{
        void blowhorn(){
            System.out.println("horn blow");
        }
        public void appyBrakes(int decrement){
            System.out.println("Apply brakes");
        }
        public void speedup(int increment){
            System.out.println("Speeding up");
        }
    }

}
