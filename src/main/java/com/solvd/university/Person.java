package com.solvd.university;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Person implements Askable {

    private static final int MIN_STRING_LENGTH = 4;

    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name) throws PersonInvalidDataException {
        if (surname.length() < MIN_STRING_LENGTH || name.length() < MIN_STRING_LENGTH) {
            throw new PersonInvalidDataException("Surname and name should have length equivalent or more than " + MIN_STRING_LENGTH + " symbols");
        }
        this.surname = surname;
        this.name = name;
    }

    public Person(String surname, String name, String patronymic) throws PersonInvalidDataException {
        this(surname, name);
        if (patronymic.length() < MIN_STRING_LENGTH) {
            throw new PersonInvalidDataException("Patronymic should have length equivalent or more than " + MIN_STRING_LENGTH + " symbols");
        }
        this.patronymic = patronymic;
    }

    @Override
    public String sayCurrentTime() {
        return LocalTime.now().toString();
    }

    @Override
    public String sayCurrentDate() {
        return LocalDate.now().toString();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws PersonInvalidDataException {
        if (surname.length() < MIN_STRING_LENGTH) {
            throw new PersonInvalidDataException("Surname length should be equivalent or more than " + MIN_STRING_LENGTH + " symbols");
        }
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws PersonInvalidDataException {
        if (name.length() < MIN_STRING_LENGTH) {
            throw new PersonInvalidDataException("Name should have length equivalent or more than " + MIN_STRING_LENGTH + " symbols");
        }
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) throws PersonInvalidDataException {
        if (patronymic.length() < MIN_STRING_LENGTH) {
            throw new PersonInvalidDataException("Patronumic should have lenght equivalent or more than " + MIN_STRING_LENGTH + " symbols");
        }
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(surname, person.surname)
                && Objects.equals(name, person.name)
                && Objects.equals(patronymic, person.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.surname, this.name, this.patronymic);
    }

    public String shortNameFormat() {
        String resultString;
        if (!Objects.isNull(this.patronymic)) {
            resultString = String.format("%c.%c. %s", patronymic.charAt(0), name.charAt(0), this.surname);
        } else {
            resultString = String.format("%c. %s", name.charAt(0), this.surname);
        }
        return resultString;
    }
}
