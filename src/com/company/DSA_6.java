package com.company;

public class DSA_6 {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,6,7,8,9};
        System.out.println(linearsearch(ar));
    }
    static int linearsearch(int[] arr){
        int c=arr[0];
        for(int i:arr){
            if(i<c){
                c=i;
            }
            else{
                continue;
            }
        }
        return c;
    }

}
