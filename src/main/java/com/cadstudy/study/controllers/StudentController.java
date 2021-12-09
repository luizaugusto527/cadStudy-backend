package com.cadstudy.study.controllers;

import java.util.ArrayList;
import java.util.List;

import com.cadstudy.study.entity.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    // End Point 1 (GET)
    
    @GetMapping
    public List<Student> getStudent(){
       Student s1 = new Student();
       Student s2 = new Student();

        
       s1.setId(1);
        s1.setNome("Luiz");
        s1.setIdade(27);
        s1.setCidade("Sorocaba");
        s1.setEmail("luiz@gmail.com");
        s1.setSemestre("3");
        String curso = "Anásise e desenvolvimento de sistemas";
        s1.setCurso(curso);
        
        s2.setId (2);
        s2.setNome("Mariana");
        s2.setIdade(23);
        s2.setCidade("Itu");
        s2.setEmail("mariana@gmail.com");
        s2.setSemestre("7");
         curso = "Direito";
        s2.setCurso(curso);
        
        ArrayList<Student> list  = new ArrayList<>();
        return list;
    }
}
