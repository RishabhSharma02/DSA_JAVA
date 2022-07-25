package com.company;

public class practiseset {
    static void table(int x){
        for(int i=1;i<=10;i++){
            System.out.println(+x+"X"+i+"="+i*x);
        }
    }
    static void star(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sum(int n){
        if (n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        //table(6);
        //star(5);
        int c=sum(3);
        System.out.println(+c);
    }
}
