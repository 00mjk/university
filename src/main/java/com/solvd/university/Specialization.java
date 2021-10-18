package com.solvd.university;

public class Specialization {

    private static final int MIN_STRING_LENGTH = 5;

    private String name;

    public Specialization(String name) throws SpecialisationInvalidDataException {
        if (name.length() < MIN_STRING_LENGTH) {
            throw new SpecialisationInvalidDataException("Specialisation name should have length equivalent or more than " + MIN_STRING_LENGTH + " symbols");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws SpecialisationInvalidDataException {
        if (name.length() < MIN_STRING_LENGTH) {
            throw new SpecialisationInvalidDataException("Specialisation name should have length equivalent or more than " + MIN_STRING_LENGTH + " symbols");
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Specialization that = (Specialization) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Specialisation: %s", this.name);
    }
}
