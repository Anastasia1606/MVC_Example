package org.example.model;

public class Student extends User {
    private Integer id;
    private double averageMark;

    public Student(String firstName, String secondName, Integer year, double averageMark, Integer id) {
        super(firstName, secondName, year);
        this.id = id;
        this.averageMark = averageMark;
    }

    public Student(String firstName, String secondName, Integer year, double averageMark) {
        super(firstName, secondName, year);
        this.averageMark = averageMark;
    }


    public Integer getId() {
        return id;
    }

    public double getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return "Студент: ID - " + id  +
                ", Имя - " + getFirstName()  +
                ", Фамилия - " + getSecondName()  +
                ", Год рождения - " + getYearBithday() +
                ", средний бал - " + averageMark;
    }


}