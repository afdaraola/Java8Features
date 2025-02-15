package com.practique.firstApp.ConcurrentExample;

public class ThreadExamples {
    public static void main(String[] args) {

        Thread evenThread = new Thread(
                ()->{
                    for(int i =2; i < 11; i+=2){
                        System.out.println("Even -"+ i);

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }

        );

        Thread oddThread = new Thread(
                ()->{
                    for(int i =1; i < 11; i+=2){
                        System.out.println("odd -"+ i);

                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );

        evenThread.start();

        oddThread.start();

    }
}
