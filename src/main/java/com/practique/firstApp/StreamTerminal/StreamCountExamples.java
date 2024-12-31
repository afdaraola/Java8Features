package com.practique.firstApp.StreamTerminal;

import com.practique.firstApp.StudentService;

import static java.util.stream.Collectors.counting;

public class StreamCountExamples {
    public static void main(String[] args) {
        System.out.println(count());

    }

    public static long count(){
        StudentService studentService = new StudentService();
     return   studentService.getAllStudent().stream()
                .filter(studentDao -> studentDao.getAge()>=7)
                .collect(counting());

    }
}
