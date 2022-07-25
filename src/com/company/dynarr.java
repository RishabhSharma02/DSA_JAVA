package com.company;
import java.util.*;
public class dynarr {
    public static void main(String[] args) {
        ArrayList<Integer> arst = new ArrayList<>(5);
        arst.add(45);
        arst.add(56);
        arst.add(45);
        arst.add(56);
        arst.add(45);
        arst.add(56);
        arst.add(45);
        arst.add(56);
        arst.remove(2);
        System.out.println(arst);
    }
}
