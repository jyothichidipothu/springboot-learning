package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class studentService {
    public List<student> getStudents(){
        return List.of(
                new student(
                        1223L,
                        "jyothi",
                        21,
                        LocalDate.of(2004, Month.NOVEMBER,17),
                        "jyo@gmail.com"
                ));
    }
}
