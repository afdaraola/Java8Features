package com.practique.firstApp;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

@Component
public class StudentService {

public  Supplier<StudentDao> studentDaoSupplier = ()->{
    return   new StudentDao("Alvin","Daramola", 7,"Notre Domel","Primary","French", Arrays.asList("Swimming","Football","Running"));
};

    public   List<StudentDao> getAllStudent(){

        StudentDao studentDao =
                new StudentDao("Alvin","Daramola", 7,"Notre Domel","Primary","French", Arrays.asList("Swimming","Football","Running"));


        StudentDao studentDao1 =
                new StudentDao("Momore","Daramola", 4,"DayCare","Pre-school","English",Arrays.asList("Swimming","Dancing","Running"));

        StudentDao studentDao2 =
                new StudentDao("Jane","Ojo", 12,"Laval","Primary school","English",Arrays.asList("Swimming","Singing","Reading","Sleeping"));


        List<StudentDao> students = Arrays.asList(studentDao,studentDao1,studentDao2);
        return  students;
    }


}
