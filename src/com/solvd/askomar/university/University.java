package com.solvd.askomar.university;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Date;

public class University extends EducationalInstitution {

    private static final Logger logger = LogManager.getLogger(University.class);

    private Department[] departments;

    public University(String name, Department[] departments) {
        super(name);
        this.departments = departments;
    }

    public University(String name, Date basedDate, City city, Department[] departments) {
        super(name, basedDate, city);
        this.departments = departments;
        logger.debug("University was created");
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
        StringBuilder resultString = new StringBuilder();
        for (Department department : departments) {
            resultString.append(department.getName()).append(" ");
        }
        return resultString.toString();
    }

    public String getFullUnivercityInfo() {
        StringBuilder info = new StringBuilder("University: " + this.getName() + "\n");
        for (Department department : this.departments) {
            info.append("Department: ").append(department.getName()).append("\n");
            for (int j = 0; j < department.getSpecializations().length; j++) {
                info.append(department.getSpecializations()[j].getName()).append("\n");
            }
        }
        return info.toString();
    }
}
