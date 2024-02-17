package org.example.view;

import org.example.model.EducationalGroup;
import org.example.model.Student;
import org.example.model.Teacher;

import java.util.List;

public class StudyView {

    public void printStudent(Student student){
        System.out.println(student);
    }

    public void printTeacher(Teacher teacher){
        System.out.println(teacher);
    }

    public void printGroup(EducationalGroup group){
        System.out.println(group);
    }

    public void printListStudents(List<Student> listStudents) {
        System.out.println("Все студенты: ");
        for (Student student : listStudents) {
            System.out.println(student);
        }
        System.out.println("---------------");
    }

    public void printListTeachers(List<Teacher> listTeachers) {
        System.out.println("Все преподаватели: ");
        for (Teacher teacher : listTeachers) {
            System.out.println(teacher);
        }
        System.out.println("---------------");
    }
}
