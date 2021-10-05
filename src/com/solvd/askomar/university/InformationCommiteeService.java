package com.solvd.askomar.university;

public class InformationCommiteeService {

  public String getSpecializationPlanInfo(SpecializationPlan specializationPlan) {
    return specializationPlan.toString();
  }

  public String getEducationIntstituteInfo(EducationalInstitution educationalInstitution) {
    return educationalInstitution.toString();
  }
}
