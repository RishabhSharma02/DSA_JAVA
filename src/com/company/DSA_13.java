package com.company;

public class DSA_13 {
    public static void main(String[] args) {
        char[] arr= {'a','b','c'};
        char tg='a';
        System.out.println(letters(arr,tg));
    }
    public static char letters(char[] letters, char tgt){
        int st=0;
        int end=letters.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if (tgt<letters[mid]){
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return letters[st%letters.length];
    }

}
