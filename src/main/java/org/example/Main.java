package org.example;

import org.example.domain.Status;
import org.example.service.TaskService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.example");

        var bean = applicationContext.getBean(TaskService.class);
        bean.findTaskByStatus(Status.IN_PROGRESS).forEach(System.out::println);
    }
}