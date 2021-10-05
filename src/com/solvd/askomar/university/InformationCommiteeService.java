package com.solvd.askomar.university;

import com.solvd.askomar.university.specialplan.SpecializationPlan;

public class InformationCommiteeService {
  private SpecializationPlan[] specializationPlans;

  public InformationCommiteeService(SpecializationPlan[] specializationPlans) {
    this.specializationPlans = specializationPlans;
  }

  public String getSpecializationPlanInfo(SpecializationPlan specialization) {
    return specialization.toString();
  }
}
