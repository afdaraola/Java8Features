package com.practique.firstApp.StreamTerminal;

import com.practique.firstApp.StudentService;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamMappingExamples {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();

    List<String> listString =    studentService.getAllStudent().stream()
                .collect(mapping(studentDao -> studentDao.getFirstName(),toList()));

        System.out.println(listString);

        Set<String> setString =    studentService.getAllStudent().stream()
                .collect(mapping(studentDao -> studentDao.getFirstName(),toSet()));

        System.out.println(setString);
    }
}
