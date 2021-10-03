package com.solvd.askomar.university;

import java.time.LocalDateTime;

// transl. Абтуриент
public class Entrant {

    private static Integer entrantAmount = 0;

    private Integer id;
    private String surname;
    private String name;
    private String patronymic;
    private LocalDateTime dateOfBirth;
    private Certificate[] certificates;

    public Entrant(String surname, String name, LocalDateTime dateOfBirth,  Certificate... certificates) {
        this.id = ++entrantAmount;
        this.surname = surname;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.certificates = certificates;
    }

    public Entrant(String surname, String name, String patronymic,  LocalDateTime birthDateTime, Certificate...certificates) {
        this(surname, name, birthDateTime, certificates);
        this.patronymic = patronymic;
    }

    public static Integer getEntrantAmount() {
        return entrantAmount;
    }

    public Integer getId() {
        return this.id;
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

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Certificate[] getCertificates() {
        return certificates;
    }

    public void setCertificates(Certificate[] certificates) {
        this.certificates = certificates;
    }



    public Integer getSumMark() {
        int sumMark = 0;

        for (int i = 0; i < certificates.length; i++) {
            sumMark += this.certificates[i].getMark();
        }
        return sumMark;
    }

}
