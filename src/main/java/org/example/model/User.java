package org.example.model;

public class User {
    private String firstName;
    private String secondName;
    private Integer yearBithday;

    public User(String firstName, String secondName, Integer yearBithday) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearBithday = yearBithday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Integer getYearBithday() {
        return yearBithday;
    }

    @Override
    public String toString() {
        return firstName + ' ' +
                secondName + ", " +
                yearBithday +
                " г.р.";
    }
}
