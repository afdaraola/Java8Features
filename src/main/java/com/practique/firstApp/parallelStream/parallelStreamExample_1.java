package com.practique.firstApp.parallelStream;

import com.practique.firstApp.StudentDao;
import com.practique.firstApp.StudentService;

import javax.swing.text.html.StyleSheet;
import java.util.List;
import java.util.stream.Collectors;

public class parallelStreamExample_1 {

    public static void main(String[] args) {

        System.out.println(sequenceListOfStudentActivities());

        System.out.println(ParallelListOfStudentActivities());
    }

    public static List<String> sequenceListOfStudentActivities(){

        StudentService studentService = new StudentService();

        long startTime = System.currentTimeMillis();

        List<String> studentDaoList=    studentService.getAllStudent().stream()
                .map(studentDao -> studentDao.getActivities())
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime = System.currentTimeMillis();

        System.out.println("sequenceListOfStudentActivities execute time: "+ (endTime-startTime));

        return studentDaoList;
    }

    public static List<String> ParallelListOfStudentActivities(){

        StudentService studentService = new StudentService();

        long startTime = System.currentTimeMillis();

        List<String> studentDaoList=    studentService.getAllStudent().stream()
                .parallel()
                .map(studentDao -> studentDao.getActivities())
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime = System.currentTimeMillis();

        System.out.println("ParallelListOfStudentActivities execute time: "+ (endTime-startTime));

        return studentDaoList;

    }

}
