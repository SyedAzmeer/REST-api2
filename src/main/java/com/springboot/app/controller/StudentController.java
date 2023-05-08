package com.springboot.app.controller;

import com.springboot.app.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Syed","Azmeer",101,"Shah Alam");
    }

    @GetMapping("/student-list")
    public List<Student> getStudentList(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Syed","Azmeer",101,"Shah Alam"));
        students.add(new Student("John","Doe",102,"Setia Alam"));
        students.add(new Student("Marcel","Sabitzer",103,"Puncak Alam"));

        return students;
    }

    @GetMapping("/studentPath/{firstName}/{lastName}/")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName){
        return new Student(firstName,lastName);
    }

    @GetMapping("/student/query")
    public Student studentQueryParam(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName) {
        return new Student(firstName, lastName);
    }
}
