package com.practique.firstApp.Collections;

import java.util.Vector;

public class VectorsExample {
    public static void main(String[] args) {

        Vector v = new Vector();
        Vector v1 = new Vector(20);
        Vector v2 = new Vector(30,10);

        v.add(3);
        v.add(6);
        v.add(1,10);

        System.out.println(v);

        v.addElement("Hello");

        System.out.println(v);

        System.out.println( " Capacity - "+v.capacity());

        v.forEach(System.out::println);

        System.out.println("contains - "+v.contains("Hello"));

    }
}
