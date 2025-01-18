package com.practique.firstApp.Inheritance;

public class Test {
    public static void main(String[] args) {
        Animal horse = new Horse();
        ((Rideable)horse).ride("");
        ((Horse)horse).ride("");

    }
}
