package com.solvd.university;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.List;

public class University extends EducationalInstitution {

    private static final Logger logger = LogManager.getLogger(University.class);

    private List<Department> departments;

    public University(String name, List<Department> departments) {
        super(name);
        this.departments = departments;
    }

    public University(String name, Date basedDate, City city, List<Department> departments) {
        super(name, basedDate, city);
        this.departments = departments;
        logger.debug("University was created");
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
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
        result = 31 * result + departments.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return String.format(
                "%s\n\tDepartments: - %s", super.toString(), this.departments.toString());
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
            for (int j = 0; j < department.getSpecializations().size(); j++) {
                info.append(department.getSpecializations().get(j).getName()).append("\n");
            }
        }
        return info.toString();
    }
}
