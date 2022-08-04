package com.company;

public class Prime_nos {
    public static void main(String[] args) {

        finder(40);

    }
    public static void finder(int n){
        boolean[] arr=new boolean[n+1];
        for (int i = 2; i*i <=n ; i++) {
            if(!arr[i]){
                for (int j = i*2; j <= n; j+=i) {
                    arr[j]=true;

                }
            }

        }
        for (int i = 2; i <=n ; i++) {
            if(!arr[i]){
                System.out.print(i+" ");
            }

        }

    }

}
