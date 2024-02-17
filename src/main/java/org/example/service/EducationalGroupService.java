package org.example.service;

import org.example.model.EducationalGroup;
import org.example.model.Student;
import org.example.model.Teacher;

import java.util.ArrayList;
public class EducationalGroupService {

    public EducationalGroup CreateEducationalGroup(Teacher teacher, ArrayList<Student> students) {
        return new EducationalGroup(teacher, students);
    }
}
