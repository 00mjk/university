package com.solvd.askomar.university;

// transl. Сотрудник
public class Employee {

    private String surname;
    private String name;
    private String patronymic;
    private EmployeePosition employeePosition;

    public Employee(String surname, String name, EmployeePosition employeePosition) {
        this.surname = surname;
        this.name = name;
        this.employeePosition = employeePosition;
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

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    public String getFullName() {
        return this.surname + " " + this.name +  " " +(this.patronymic != null ? this.patronymic : "") + " " + this.employeePosition.getName();
    }

    public void printFullNameToConsole() {
        System.out.println(getFullName());
    }
}
