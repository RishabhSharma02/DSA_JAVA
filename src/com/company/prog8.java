package com.company;
import java.lang.Math;
import java.util.*;
class game{
        static void game(int x) {
            Random rand=new Random();

            int y = 0;
            if (rand.nextInt(2) == x) {
                y += 1;
            }
            if (y == 1) {
                System.out.println("You win");

            } else {
                System.out.println("Computer  win");
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            game(a);
        }
}
