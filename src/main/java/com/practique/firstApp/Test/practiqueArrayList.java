package com.practique.firstApp.Test;

import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.Stream;

public class practiqueArrayList {
    public static void main(String[] args) {
      //  arrayList();
        Stacks();
    }

    public static void arrayList(){
        ArrayList<Integer> lists = new ArrayList<>();

        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);

//        for(int list : lists){
//            System.out.println(list);
//        }

        Stream<Integer> stream = lists.stream();
        stream.forEach(System.out::println);
    }

    public static void Stacks(){
        Stack<String> stack = new Stack<>();

        stack.add("Festus");
        stack.add("Abayomi");
        stack.add("Ademola");
        stack.add("Daramola");

        stack.add(2,"Yomi");

        System.out.println("first Elemeent "+stack.firstElement());

        System.out.println("size "+stack.size());

        System.out.println("peek "+stack.peek());

        System.out.println("pop - "+stack.pop());

        Stream<String> stringStream = stack.stream();
        stringStream.forEach(System.out::println);
    }
}
