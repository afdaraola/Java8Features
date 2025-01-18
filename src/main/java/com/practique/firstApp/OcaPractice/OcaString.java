package com.practique.firstApp.OcaPractice;

public class OcaString {
    public static void main(String[] args) {

        String [][] arr = { {"%", "$$"}, {"***", "@@@@", "#####"}};
        for(String [] str : arr) {
            System.out.println("-->"+arr);
            for(String s : str) {
                System.out.println(s);
                System.out.println(s.length());
                if(s.length() == 4) //Line n1
                    break; //Line n2
            }
            break; //Line n3
        }
    }
}
