package com.solvd.university;

import java.util.List;
import java.util.Objects;

public class Department {

    private String name;
    private List<Specialization> specializations;

    public Department(String name, List<Specialization> specializations) {
        this.name = name;
        this.specializations = specializations;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Specialization> getSpecializations() {
        return specializations;
    }

    public void setSpecializations(List<Specialization> specializations) {
        this.specializations = specializations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that;
        that = (Department) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + specializations.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Department{" + "name='" + name + '\'' +
                ", specializations=" + specializations.toString() +
                '}';
    }
}
