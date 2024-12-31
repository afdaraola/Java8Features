package com.practique.firstApp.StreamTerminal;

import com.practique.firstApp.StudentService;

import java.util.stream.Collectors;

public class StreamJoiningExample {
    public static void main(String[] args) {
        System.out.println("Joining_1 "+ joining_1());

        System.out.println("Joining_2 "+ joining_2());

        System.out.println("Joining_3 "+ joining_3());
    }

    public static String joining_1(){
        StudentService studentService = new StudentService();

       return studentService.getAllStudent().stream()
                .map(studentDao -> studentDao.getFirstName())
                .collect(Collectors.joining());
    }

    public static String joining_2(){
        StudentService studentService = new StudentService();

        return studentService.getAllStudent().stream()
                .map(studentDao -> studentDao.getFirstName())
                .collect(Collectors.joining("-"));
    }

    public static String joining_3(){
        StudentService studentService = new StudentService();

        return studentService.getAllStudent().stream()
                .map(studentDao -> studentDao.getFirstName())
                .collect(Collectors.joining("-","(",")"));
    }

}
