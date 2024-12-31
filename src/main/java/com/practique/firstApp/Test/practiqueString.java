package com.practique.firstApp.Test;

import java.util.Arrays;
import java.util.regex.Pattern;

public class practiqueString {
    public static void main(String[] args) {
       //StringChar();
        splitString();
    }

    public static void StringChar(){

        StringBuilder sb = new StringBuilder(8);

        StringBuffer sbf = new StringBuffer(8);
        String word = "practice";

        for(char c : word.toCharArray()){
            System.out.print(c+ " - ");

            sb.append(c);

            sbf.append(c);
        }

        System.out.println("\n====================sb=========================");

        System.out.println(sb);

        System.out.println("===================sbf==========================");

        System.out.println(sbf);

    }

    public static void splitString(){
            String text = "I am learning Java";
             // Removing All Whitespace
          String text1 =  text.replaceAll("\\s+", "-");
        System.out.println(text1);

                // Splitting a String
     String txt2 = Arrays.toString(text1.split("\\-"));

     for(char k : text.toCharArray()) {
         System.out.println(k);
     }

        System.out.println(txt2);

            text.split(Pattern.quote("|"));
        System.out.println(text);
    }
}
