package com.practique.firstApp.Algorithm;


import java.util.HashSet;

public class Controller {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(2);

        linkedList.append(3);

        linkedList.prepend(1);

      //  System.out.println(linkedList.get(2).value);


       linkedList.printList();

        System.out.println("\n "+linkedList.set(1,5));

        linkedList.printList();

        System.out.println("\n "+linkedList.insert(2,10));

        linkedList.printList();

        System.out.println("\n remove index 1 : "+ linkedList.remove(1).value);

        HashSet<Integer> hashSet = new HashSet<>();

        linkedList.printList();

        linkedList.reverse();

        System.out.println(" \n reverse Linke : ") ;
    linkedList.printList();

      // linkedList.printAll();

//        System.out.println(linkedList.removeFirst().value);
//
//        System.out.println(linkedList.removeFirst().value);
//
//        System.out.println(linkedList.removeFirst());
    }
}
