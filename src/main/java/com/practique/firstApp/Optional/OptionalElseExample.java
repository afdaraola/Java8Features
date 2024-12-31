package com.practique.firstApp.Optional;

import com.practique.firstApp.StudentDao;
import com.practique.firstApp.StudentService;

import java.util.Optional;

public class OptionalElseExample {
    public static void main(String[] args) {

        System.out.println(optionalElse());
        System.out.println(optionalElseGet());
        System.out.println(optionalElseThrow());
    }

    public static String optionalElse(){
        StudentService studentService = new StudentService();

      Optional<StudentDao> optionalStudentDao =  Optional.ofNullable(studentService.studentDaoSupplier.get());
       // Optional<StudentDao> optionalStudentDao =  Optional.ofNullable(null);

        String name = optionalStudentDao.map(StudentDao::getFirstName).orElse("Default");


        return name;
    }

    public static String optionalElseGet(){
        StudentService studentService = new StudentService();

          Optional<StudentDao> optionalStudentDao =  Optional.ofNullable(studentService.studentDaoSupplier.get());
       // Optional<StudentDao> optionalStudentDao =  Optional.ofNullable(null);

        String name = optionalStudentDao.map(StudentDao::getFirstName).orElseGet(()->"Default");


        return name;
    }


    public static String optionalElseThrow(){
        StudentService studentService = new StudentService();

          Optional<StudentDao> optionalStudentDao =  Optional.ofNullable(studentService.studentDaoSupplier.get());
      //  Optional<StudentDao> optionalStudentDao =  Optional.ofNullable(null);

        String name = optionalStudentDao.map(StudentDao::getFirstName).orElseThrow(()-> new RuntimeException("No data Available"));


        return name;
    }
}
