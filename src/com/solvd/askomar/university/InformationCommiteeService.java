package com.solvd.askomar.university;

public class InformationCommiteeService {

    public static String getSpecializationPlanInfo(SpecializationPlan specializationPlan) {
        return specializationPlan.toString();
    }

    public static String getEducationIntstituteInfo(EducationalInstitution educationalInstitution) {
        return educationalInstitution.toString();
    }

    public static String getPersonShortName(Person person) {
        return person.shortNameFormat();
    }
}
