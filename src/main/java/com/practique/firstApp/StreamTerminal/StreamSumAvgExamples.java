package com.practique.firstApp.StreamTerminal;

import com.practique.firstApp.StudentDao;
import com.practique.firstApp.StudentService;

import java.util.stream.Collectors;

public class StreamSumAvgExamples {
    public static void main(String[] args) {

        System.out.println("sum age : "+ sum());

        System.out.println("average age : "+ average());
    }

    public static int sum(){
        StudentService studentService = new StudentService();

        return studentService.getAllStudent().stream()
                .collect(Collectors.summingInt(StudentDao::getAge));

    }

    public static double average(){
        StudentService studentService = new StudentService();

        return studentService.getAllStudent().stream()
                .collect(Collectors.averagingDouble(StudentDao::getAge));

    }

}
