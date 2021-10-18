package com.solvd.university;

public interface InformationCommiteeService {

    String getSpecializationPlanInfo(SpecializationPlan specializationPlan);

    String getEducationIntstituteInfo(EducationalInstitution educationalInstitution);

    String getPersonShortName(Person person);

    String getSpecialisationAccessibility(Accessible accessible);

    String askAboutCurrentDateTime(Askable askable);

    boolean isValidDocument(Checkable checkable);

    String getAbbreviation(Abbreviable abbreviable);
}
