package com.practique.firstApp.NumbericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExamples {


    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("Sum of the Integer:- " + sumNoOfInteger(listInteger));
        System.out.println("Sum range close -" + sumIntRangeClosed());
    }

    public static int sumNoOfInteger(List<Integer> listInteger) {

        return listInteger.stream()
                .reduce(0, (x, y) -> x + y);
    }

    public static int sumIntRangeClosed() {

        return IntStream.rangeClosed(1, 6)
                .sum();
    }
}

