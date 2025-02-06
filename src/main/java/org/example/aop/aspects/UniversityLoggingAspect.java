package org.example.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.example.aop.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents ())")
//    public void beforeGetStudentsLoggingAdvise() {
//        System.out.println("Before getStudentsLoggingAdvise: логируем получение " +
//                "список студентов перед методом getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents ())",
//    returning = "students")
//    public void afterReturningGetStudentsLoggingAdvise(List<Student> students) {
//
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double abgGrade = firstStudent.getAvgGrade();
//        abgGrade = abgGrade + 1.0;
//        firstStudent.setAvgGrade(abgGrade);
//
//        System.out.println("Before getStudentsLoggingAdvise: логируем получение " +
//                "список студентов после работы метода getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//        throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvise(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvise: логируем выброс исключения " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvise() {
        System.out.println("afterThrowingGetStudentsLoggingAdvise: логируем нормальное окончание либо исключение ");
    }

}
