package com.company;

public class Container {
    public static int max_height(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
                System.out.println(arr[i]);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
       int[] arr={1,8,6,2,5,4,8,3,7};
         max_height(arr);
    }

}
