package com.practique.firstApp.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(1,"Alvin");
        names.put(2,"Mo");
        names.put(3,"Festo");
        names.put(4,"Enny");

        names.forEach((key,value)-> System.out.println(key+" : "+value));

        names.entrySet().forEach((k)-> System.out.println( k.getKey() +": " + k.getValue()));

        names.values().forEach(System.out::println);

        names.putIfAbsent(4,"Enny");

        System.out.println("-----------------------");
        names.values().forEach(System.out::println);
    }

}
