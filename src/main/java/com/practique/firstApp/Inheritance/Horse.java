package com.practique.firstApp.Inheritance;

public class Horse extends Animal implements Rideable{

    public void ride(String name) {
        System.out.println(name.toUpperCase() +"  IS RIDING THE HORSE");
    }
}
