package com.solvd.askomar.university;

import java.util.Arrays;
import java.util.Date;

public class University extends EducationalInstitution {

    private Department[] departments;

    public University(String name, Department[] departments) {
        super(name);
        this.departments = departments;
    }

    public University(String name, Date basedDate, City city, Department[] departments) {
        super(name, basedDate, city);
        this.departments = departments;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(departments);
        return result;
    }

    @Override
    public String toString() {
        return String.format(
                "%s\n\tDepartments: - %s", super.toString(), Arrays.toString(this.departments));
    }

    @Override
    public String getEducationalInstitutionType() {
        return "University";
    }

    public String getDepartamentsByString() {
        String resultString = "";
        for (int i = 0; i < departments.length; i++) {
            resultString += departments[i].getName() + " ";
        }
        return resultString;
    }

    public String getFullUnivercityInfo() {
        String info = "University: " + this.getName() + "\n";
        for (int i = 0; i < this.departments.length; i++) {
            info += "Department: " + this.departments[i].getName() + "\n";
            for (int j = 0; j < this.departments[i].getSpecializations().length; j++) {
                info += this.departments[i].getSpecializations()[j].getName() + "\n";
            }
        }
        return info;
    }
}
