package com.practique.firstApp.Optional;

import java.util.IntSummaryStatistics;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InstStreamStatExample {
    public static void main(String[] args) {

        var intStream = IntStream.of(7,9,3,6);

        IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();

        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getSum());

        Locale locale = Locale.getDefault();
        System.out.println(locale);
    }
}
