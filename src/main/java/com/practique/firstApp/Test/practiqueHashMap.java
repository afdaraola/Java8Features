package com.practique.firstApp.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class practiqueHashMap {
    public static void main(String[] args) {
       // hashMap();
        hashSetPractice();
    }

    public static void hashMap(){
        Map<Integer,String> m = new HashMap<>();

        m.put(1, "One");
        m.put(2,"Two");
        m.put(3,"Three");
        m.put(4,"Four");
        m.put(2, "double Two"); //override existing key

        m.putIfAbsent(1,"One");

        System.out.println(m.size());

        System.out.println(m.get(3));



        //lamda
        System.out.println("=================lamda===========================");
        m.forEach((key,value)->{
            System.out.println("Key - "+ key +" : Value -"+ value);
        });

        System.out.println("=================enhance key===========================");
       for (int k : m.keySet()){
           System.out.println(k);
       }

        System.out.println("=================enhance value===========================");
        for (String k : m.values()){
            System.out.println(k);
        }
    }

    public static void hashSetPractice(){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(1);

        set.forEach( (x) -> {
            System.out.println(x);
        } );


    }
}
