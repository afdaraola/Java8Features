package com.practique.firstApp.Test;

public class practiceSwap {
    public static void main(String[] args) {
        swap();
    }

    public static void swap(){
        String first = "A";
        String second = "B";

        System.out.println("first - "+first +" second - "+ second);

        String temp = first;
        first = second;
        second =temp;

        System.out.println("first - "+first +" second - "+ second);
    }
}
