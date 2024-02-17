package org.example.controller;

import org.example.model.EducationalGroup;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.User;
import org.example.service.EducationalGroupService;
import org.example.service.StudentService;
import org.example.service.TeacherService;
import org.example.view.StudyView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private StudentService studentService;
    private TeacherService teacherService;
    private EducationalGroupService educationalGroupService;
    private StudyView studyView;

    public Controller() {
        studentService = new StudentService();
        teacherService = new TeacherService();
        educationalGroupService = new EducationalGroupService();
        studyView = new StudyView();
    }

    public Student createStudent(User user, double averageMark) {
        return studentService.create(user, averageMark);
    }

    public Teacher createTeacher(User user, String subject) {
        return teacherService.create(user, subject);
    }

    public EducationalGroup createGroup(Teacher teacher, ArrayList<Student>  students) {
        return educationalGroupService.CreateEducationalGroup(teacher, students);
    }

    public void printStudents() {
        studyView.printListStudents(studentService.read());
    }

    public void printTeachers() {
        studyView.printListTeachers(teacherService.read());
    }

    public void printEducationalGroup(EducationalGroup group) {
        studyView.printGroup(group);
    }

    public void start() {

        Student student1 = createStudent(
                new User("Семен", "Иванов", 2000), 4.5);
        Student student2 = createStudent(
                new User("Иван", "Петров", 2001), 3.2);
        Student student3 = createStudent(
                new User("Перт", "Семенов", 2002), 4.99);
        Student student4 = createStudent(
                new User("Валентин", "Егоров", 2002), 4.0);
        Teacher teacher1 = createTeacher(
                new User("Роман", "Горюнов", 1964), "Философия");
        Teacher teacher2 = createTeacher(
                new User("Алексей", "Шнуров", 1990), "Высшая математика");
        EducationalGroup group1 = createGroup(teacher1,
                new ArrayList<Student>(Arrays.asList(student1, student2, student3)));

        printStudents();
        printTeachers();
        printEducationalGroup(group1);

    }
}
