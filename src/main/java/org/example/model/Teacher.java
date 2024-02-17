package org.example.model;

public class Teacher extends User {
    private Integer id;
    private String subject;
    public Teacher(String firstName, String secondName, Integer year, String subject, Integer id) {
        super(firstName, secondName, year);
        this.id = id;
        this.subject = subject;
    }

    public Teacher(String firstName, String secondName, Integer year, String subject) {
        super(firstName, secondName, year);
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Преподаватель: ID - " + id  +
                ", Имя - " + getFirstName()  +
                ", Фамилия - " + getSecondName()  +
                ", Год рождения - " + getYearBithday() +
                ", Предмет - " + subject;
    }
}