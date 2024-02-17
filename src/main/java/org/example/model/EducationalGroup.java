package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class EducationalGroup {
    private Teacher teacher;
    private List<Student> students;

    public EducationalGroup(Teacher teacher, ArrayList<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder( "Учебная группа: \n " + teacher + ",\n студенты: \n");

        for (Student student : students) {
            res.append(student.toString());
            res.append("\n");
        };
        return res.toString();

    }
}