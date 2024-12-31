package com.practique.firstApp.StreamTerminal;

import com.practique.firstApp.StudentDao;
import com.practique.firstApp.StudentService;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamPartitionByExample {

    public static void main(String[] args) {

       // partitionByExample();
        partitionByExample_2();
    }

    public static void partitionByExample(){

        StudentService studentService = new StudentService();

        Predicate<StudentDao> predicate = studentDao -> studentDao.getAge()>=7;

        Map<Boolean, List<StudentDao>> partitionByMap = studentService.getAllStudent().stream()
                .collect(partitioningBy(predicate));

        System.out.println("partitionByMap_1: "+partitionByMap);
    }


    public static void partitionByExample_2(){

        StudentService studentService = new StudentService();

        Predicate<StudentDao> predicate = studentDao -> studentDao.getAge()>=7;

        Map<Boolean, Set<StudentDao>> partitionByMap = studentService.getAllStudent().stream()
                .collect(partitioningBy(predicate,toSet()));

        System.out.println("partitionByMap_2: "+partitionByMap);
    }


}
