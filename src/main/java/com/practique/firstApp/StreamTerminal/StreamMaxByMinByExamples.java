package com.practique.firstApp.StreamTerminal;

import com.practique.firstApp.StudentDao;
import com.practique.firstApp.StudentService;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMaxByMinByExamples {
    public static void main(String[] args) {
        System.out.println(minBy());
        System.out.println(MaxBy());
    }
    public static Optional<StudentDao> minBy(){
        StudentService studentService = new StudentService();
     Optional<StudentDao> studentDaoMinList =   studentService.getAllStudent().stream()
                .collect(Collectors.minBy(Comparator.comparing(StudentDao::getAge)));

     return studentDaoMinList;
    }

    public static Optional<StudentDao> MaxBy(){
        StudentService studentService = new StudentService();
        Optional<StudentDao> studentDaoMaxList =   studentService.getAllStudent().stream()
                .collect(Collectors.maxBy(Comparator.comparing(StudentDao::getAge)));

        return studentDaoMaxList;
    }

}
