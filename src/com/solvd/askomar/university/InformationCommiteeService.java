package com.solvd.askomar.university;

import com.solvd.askomar.university.educatinstitut.EducationalInstitution;
import com.solvd.askomar.university.specialplan.SpecializationPlan;

public class InformationCommiteeService {

  public String getSpecializationPlanInfo(SpecializationPlan specializationPlan) {
    return specializationPlan.toString();
  }

  public String getEducationIntstituteInfo(EducationalInstitution educationalInstitution) {
    return educationalInstitution.toString();
  }
}
