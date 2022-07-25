package com.company;
public class qn1 {
    public static void main(String[] args) {
        float[] ar = {1.2f,1.3f,1.4f,1.5f};
        float sum=0;
        /*float num=1.5f;
        boolean isInArray=false;
        for(float element:ar) {
            if (element == num) {
                isInArray = true;
                break;
            }
        }
                if(isInArray){
                System.out.println("is in array");
            }
            else{
                System.out.println("Is not in array");
            }*/
        //practice prob 3
        for(float element:ar){
            sum=sum+element;
        }
        System.out.println("Average is " + sum / ar.length);
        }
    }

