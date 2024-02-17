package org.example.service;

import org.example.model.Student;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements DataService<Student> {
    List<Student> listStudent;

    public StudentService() {
        listStudent = new ArrayList<>();
    }

    public Student create(User user, double averageMark) {

        Student student = new Student(
                user.getFirstName(),
                user.getSecondName(),
                user.getYearBithday(),
                averageMark,
                listStudent.size() + 1);

        listStudent.add(student);
        return student;
    }

    @Override
    public Student create(User user) {
        Student student = new Student(
                user.getFirstName(),
                user.getSecondName(),
                user.getYearBithday(),
                0.0,
                listStudent.size() + 1);
        listStudent.add(student);
        return student;
    }

    @Override
    public List<Student> read() {
        return listStudent;
    }
}
