package com.solvd.askomar.university;

public class Entrant {
    private static Integer entrantAmount = 0;

    private Integer id;
    private String surname;
    private String name;
    private String patronymic;
    private Integer scoresAmount;

    public Entrant(String surname, String name,  Integer scoresAmount) {
        this.id = ++entrantAmount;
        this.surname = surname;
        this.name = name;
        this.scoresAmount = scoresAmount;
    }

    public Entrant(String surname, String name, String patronymic, Integer scoresAmount) {
        this(surname, name, scoresAmount);
        this.setPatronymic(patronymic);
    }

    public static Integer getEntrantAmount() {
        return entrantAmount;
    }

    public Integer getId() {
        return this.getId();
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Integer getScoresAmount() {
        return this.scoresAmount;
    }

    public void setScoresAmount(Integer scoresAmount) {
        this.scoresAmount = scoresAmount;
    }

}
