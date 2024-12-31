package com.practique.firstApp.Controller;

import com.practique.firstApp.StudentDao;
import com.practique.firstApp.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping("/getStudent")
    public ResponseEntity<List<StudentDao>> getStudent(){
         return ResponseEntity.ok().body(studentService.getAllStudent());
    }
}
