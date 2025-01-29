package com.practique.firstApp.Arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {

        String[] name = new String[]{"Ade", "Ben", "John"};

        List<String> namelist = Arrays.asList(name);
        List<String> nameoflist = List.of(name);
        List<String> nameCopy = List.copyOf(namelist);

        name[1]="Enny";
        namelist.set(1,"Festus");

        System.out.println(name);

        System.out.println(namelist);

        System.out.println(nameoflist);

        System.out.println(nameCopy);
    }

}
