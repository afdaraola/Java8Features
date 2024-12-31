package com.practique.firstApp.StreamTerminal;

import com.practique.firstApp.StudentDao;
import com.practique.firstApp.StudentService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExamples {
    public static void main(String[] args) {
     //  groupingBy_Example();
      //  customizeGroupingBy_Example();
       // twoLevelGrouping();

        threeLevelGrouping();

    }

    public static void groupingBy_Example(){
        StudentService studentService = new StudentService();

     Map<String, List<StudentDao>> stringListMap = studentService.getAllStudent().stream()
                .collect(groupingBy(studentDao -> studentDao.getCourse()));

        System.out.println(stringListMap);
    }


    public static void customizeGroupingBy_Example(){
        StudentService studentService = new StudentService();

        Map<String, List<StudentDao>> stringListMapCustomize = studentService.getAllStudent().stream()
                .collect(groupingBy(studentDao -> studentDao.getAge()>=7 ? "Primary" : "DayCare"));

        System.out.println(stringListMapCustomize);
    }



    public static void twoLevelGrouping(){
        StudentService studentService = new StudentService();

        Map<String,Integer> twoLevelMap = studentService.getAllStudent().stream()
                .collect(groupingBy(StudentDao::getCourse, summingInt(StudentDao::getAge)));

        System.out.println(twoLevelMap);
    }

    public static void threeLevelGrouping(){
        StudentService studentService = new StudentService();

        LinkedHashMap<String, Set<StudentDao>> threeLevelMap = studentService.getAllStudent().stream()
                .collect(groupingBy(StudentDao::getFirstName,
                        LinkedHashMap::new, toSet()));

        System.out.println(threeLevelMap);
    }

}
