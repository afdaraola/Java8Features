package com.practique.firstApp.OcaPractice;

import java.util.ArrayList;
import java.util.List;

public class arrExample {
    public static void main(String[] args) {

      /*  for(int i =0; i < 10; i++) {
            System.out.println(i);

        }*/
      /*  int arr[] = {2,1,0};

        for ( int i : arr){
           // System.out.println(arr[i]);  // 0,1,2
            System.out.println(i);  // 2,1,0
        }*/


        List<String> list = new ArrayList<>();
        list.add("P");
        list.add("O");
        list.add("T");

        System.out.println(list);

        List<String> sublist = list.subList(1,2);

        System.out.println(sublist);

        sublist.set(0,"E");

        System.out.println("sublist - "+sublist);

        System.out.println(list);
    }

}



