package com.practique.firstApp.OcaPractice;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExamples {
    //static  Boolean[] arr = new Boolean[1];
    public static void main(String[] args) {

            //Creating and Using Arrays
      //  String[] strings = new String[7];
       // System.out.println(strings);
     //   Lists1();

       //  char c = 'z';
       // int i = 12_1;
       // System.out.println("c - "+ (c*i));

        //Working with Selected classes from the Java API
        /*      LocalDate localDate = LocalDate.parse("2000-01-01");
            Period period = Period.ofYears(-3000);
            System.out.println(localDate.plus(period));*/

//     /*   LocalDate d1 = LocalDate.parse("1999-09-09");
//        LocalDate d2 = LocalDate.parse("1999-09-09");
//        LocalDate d3 = LocalDate.of(1999, 9, 9);
//        LocalDate d4 = LocalDate.of(1999, 9, 9);
//        System.out.println((d1==d2) + ":" + (d2 == d3) + ":" + (d3 == d4));*/

      /*  List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(true);
        list.add(false);

        if(list.remove(1)) {
            list.remove(1);
        }

        System.out.println(list);
        */

      //  System.out.println(100%10);


     /*   StringBuilder sb = new StringBuilder("SpaceStation");
      String ss=  sb.delete(5,6).insert(5," S").toString().toUpperCase();
        System.out.println(sb);
        System.out.println(ss);*/
/*
        Boolean[] arr = new Boolean[1];
            if(arr[0]) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }*/

      //  LocalDate localDate = new LocalDate();

        //Using Loop Constructs
        /*     boolean flag = true;
        do {
            System.out.println(100);
        } while (flag);

        System.out.println("bay");*/

    }


    public static void Lists(){
        List<String> list = new ArrayList<>();

        list.add("X");
        list.add("X");
        list.add("Y");
        list.add("X");

        list.remove(new String("Y"));

        System.out.println("size :"+ list.size()  );

        System.out.println(list);
    }


    public static void Lists1(){
        List<String> list = new ArrayList<>();

        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);

        System.out.println("Original size  :"+ list.size()  );
        list.remove(0);
        System.out.println("size remove indx 0:"+ list.size()  );

        list.remove(null);

        System.out.println("size rm null:"+ list.size()  );

        System.out.println(list);
    }


}
