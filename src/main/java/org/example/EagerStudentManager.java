package org.example;

import org.springframework.stereotype.Component;

@Component
public class EagerStudentManager {
    public EagerStudentManager() {
        System.out.println("EagerStudentManager initialized!");
    }
}
