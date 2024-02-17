package org.example.service;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements DataService<Teacher> {
    List<Teacher> listTeacher;

    public TeacherService() {
        listTeacher = new ArrayList<>();
    }

    public Teacher create(User user, String subject) {

        Teacher teacher = new Teacher(
                user.getFirstName(),
                user.getSecondName(),
                user.getYearBithday(),
                subject,
                listTeacher.size() + 1);
        listTeacher.add(teacher);
        return teacher;
    }

    @Override
    public Teacher create(User user) {
        Teacher teacher = new Teacher(
                user.getFirstName(),
                user.getSecondName(),
                user.getYearBithday(),
                null,
                listTeacher.size() + 1);
        listTeacher.add(teacher);
        return teacher;
    }

    @Override
    public List<Teacher> read() {
        return listTeacher;
    }
}