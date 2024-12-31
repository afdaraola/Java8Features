package com.practique.firstApp.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class parallelStreamExample {

    public static void main(String[] args) {

        System.out.println("No of Processor - "+Runtime.getRuntime().availableProcessors());
        System.out.println(" sumSequenceExample stream result "+checkPerformance(parallelStreamExample::sumSequenceExample ,
                        20));
        System.out.println(" sumParallelExample stream result "+ checkPerformance(parallelStreamExample::sumParallelExample,
                 20));
    }

    public static long checkPerformance(Supplier<Integer> supplier, int noOfTime){

        long startTime = System.currentTimeMillis();

        for(int i =0; i < noOfTime; i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();

       return endTime - startTime;

    }

    public static int sumSequenceExample(){

       return IntStream.rangeClosed(1,1000000)
                        .sum();
    }


    public static int sumParallelExample(){

        return IntStream.rangeClosed(1,1000000)
                .parallel()
                .sum();
    }
}
