package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        StudentService studentService = context.getBean(StudentService.class);
        studentService.registerStudent("Ivan Ivanov", "Computer Science");

        StudentService advancedService = context.getBean("advancedStudentService", StudentService.class);
        advancedService.registerStudent("Aruzhan Alieva", "Mathematics");

        EagerStudentManager eager = context.getBean(EagerStudentManager.class);

        System.out.println("LazyStudentManager will initialize now...");
        LazyStudentManager lazy = context.getBean(LazyStudentManager.class);
        lazy.init();

        context.close();
    }
}
