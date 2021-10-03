package com.solvd.askomar.university;

// transl. Сотрудник
public class Employee {

    private String surname;
    private String name;
    private String patronymic;
    private EmployeePosition position;

    public Employee(String surname, String name, EmployeePosition position) {
        this.surname = surname;
        this.name = name;
        this.position = position;
    }

    public Employee(String surname, String name, String patronymic, EmployeePosition employeePosition) {
        this(surname, name, employeePosition);
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

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    public String getFullName() {
        return this.surname + " " + this.name +  " " +(this.patronymic != null ? this.patronymic : "") + " " + this.position.getName();
    }

    public void printFullNameToConsole() {
        System.out.println(getFullName());
    }
}
