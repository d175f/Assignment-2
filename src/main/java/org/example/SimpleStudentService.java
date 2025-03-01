package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SimpleStudentService implements StudentService {
    private final StudentRepository repository;

    @Autowired
    public SimpleStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void registerStudent(String name, String major) {
        Student student = new Student(name, major);
        repository.save(student);
    }
}
