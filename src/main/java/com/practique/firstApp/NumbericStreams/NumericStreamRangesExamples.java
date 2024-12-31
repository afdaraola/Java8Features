package com.practique.firstApp.NumbericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExamples {
    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1, 50);

        System.out.println("Count of IntStream - " + intStream.count());

        IntStream.range(1, 50).forEach(value -> {
            System.out.print(value + " , ");
        });
        System.out.println();

        IntStream intStreamClosed = IntStream.rangeClosed(1, 50);
        System.out.println("intStreamClosed count - " + intStreamClosed.count());

        IntStream.rangeClosed(1, 50).forEach(value -> {
            System.out.print(value + " , ");
        });


        LongStream longStream = LongStream.range(1, 50);

        System.out.println("Count of longStream - " + longStream.count());
        System.out.println();
        LongStream.range(1, 50).forEach(value -> {
            System.out.print(value + " , ");
        });
        System.out.println();
        LongStream longStreamClosed = LongStream.rangeClosed(1, 50);
        System.out.println("longStreamClosed count - " + longStreamClosed.count());

        LongStream.rangeClosed(1, 50).forEach(value -> {
            System.out.print(value + " , ");
        });

        System.out.println();
        IntStream.range(1, 50).asDoubleStream().forEach(value -> System.out.print(value + " ,"));


    }


}

