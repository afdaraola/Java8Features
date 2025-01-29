package com.practique.firstApp.Optional;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

       Stream<Integer> number = Stream.iterate(1, n -> n+1);

       number.skip(2)
               .limit(10)
               .forEach(System.out::println);


       Stream<String> stringStream = Stream.of("Ade","Moyo","Mo");

       stringStream.map((s->s.length() >2)).forEach(System.out::println);

    }
}
