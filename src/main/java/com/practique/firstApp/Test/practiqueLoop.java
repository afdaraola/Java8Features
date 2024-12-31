package com.practique.firstApp.Test;


public class practiqueLoop {
    public static void main(String[] args) {

        loops();
    }


    public static void loops() {

        int[] lists = new int[]{1, 2, 34, 6, 7};
        System.out.println("Enhance Loop ");
        System.out.println("========================================================");
        for (int list : lists) {

            System.out.println(list);
        }

        System.out.println("========================================================");
        System.out.println("for loop ");

        for (int i =0; i < lists.length; i++){
            System.out.println("index "+ i + " - " + lists[i]);
        }

        System.out.println("========================================================");
        System.out.println("do loop ");

        int i =0;
        do{
            System.out.println(lists[i]);
            i++;
        } while (i < lists.length);

        System.out.println("========================================================");
        System.out.println("while loop ");


        int k = 0;
        while (k < lists.length) {
            System.out.println(lists[k]);
            k++;
        }


    }


}
