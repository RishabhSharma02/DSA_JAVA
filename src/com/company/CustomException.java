package com.company;
import java.util.Scanner;
class MyException extends Exception{
    public String getMessage(){
        return "I am getMessage";
    }

}
public class CustomException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>8){
            try {
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
