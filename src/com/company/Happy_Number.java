package com.company;

public class Happy_Number {
    public static void main(String[] args) {
    isHappy(2);
    }
    public static boolean isHappy(int n) {
        int index=0;
        int ans=0;
        if(n==1){
            return true;
        }
        else
        while(n>0){
            index=n%10;
            ans=ans+index*index;
            n=n/10;
        }
   return isHappy(ans);
    }
}
