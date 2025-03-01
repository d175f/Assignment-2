package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyStudentManager {
    public LazyStudentManager() {
        System.out.println("LazyStudentManager initialized!");
    }

    public void init() {
        System.out.println("LazyStudentManager is now being used.");
    }
}
