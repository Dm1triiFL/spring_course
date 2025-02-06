package org.example.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Dmitrii Sh", 3, 7);
        Student st2 = new Student("Yuru F", 3, 7);
        Student st3 = new Student("Alena Yu", 3, 7);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from get students");
        System.out.println(students);
        return students;
    }
}
