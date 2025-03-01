package org.example;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private final List<Student> students = new ArrayList<>();

    public void save(Student student) {
        students.add(student);
        System.out.println("Student registered: " + student.getName() + " (" + student.getMajor() + ")");
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
