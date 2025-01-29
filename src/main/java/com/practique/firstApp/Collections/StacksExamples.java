package com.practique.firstApp.Collections;

import java.util.Stack;

public class StacksExamples {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Stack stk = new Stack();

        stack.push(5);
        stack.push(6);
        stack.push(6);
        stack.push(90);

        System.out.println(stack);

        stack.add(2,55);

        System.out.println(stack);

        System.out.println("firstElement - "+stack.firstElement());

        System.out.println("get index 3 - "+stack.get(3));

        System.out.println("Peek- "+ stack.peek());

        System.out.println("pop - "+ stack.pop());

        System.out.println(stack);

        System.out.println("size - "+stack.size());

       stack.forEach(System.out::println);

       stack.stream().peek(System.out::println);

    }
}
