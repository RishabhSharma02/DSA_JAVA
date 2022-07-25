package com.company;

import java.util.HashMap;
import java.util.Map;

public class FP7 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Hello","There");
        map.put("Hell","There");
        map.put("Hel","There");
        System.out.println(map);
    }
}
