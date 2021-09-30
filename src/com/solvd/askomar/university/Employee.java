package com.solvd.askomar.university;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;

    public Employee(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Employee(String surname, String name, String patronymic) {
        this(surname, name);
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
