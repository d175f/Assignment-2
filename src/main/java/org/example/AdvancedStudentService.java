package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("advancedStudentService")
public class AdvancedStudentService implements StudentService {
    private final StudentRepository repository;

    @Autowired
    public AdvancedStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void registerStudent(String name, String major) {
        Student student = new Student(name, major + " (Scholarship)");
        repository.save(student);
    }
}
