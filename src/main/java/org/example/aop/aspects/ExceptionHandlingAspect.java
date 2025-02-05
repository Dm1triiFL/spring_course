package org.example.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {

    @Before("org.example.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAspect() {
        System.out.println("beforeGetExceptionHandlingAspect get Exception Handling ");
        System.out.println("-------------------------------");
    }
}
