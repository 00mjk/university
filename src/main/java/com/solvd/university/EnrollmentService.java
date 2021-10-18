package com.solvd.university;

import java.util.List;

public interface EnrollmentService {

    List<SpecializationPlan> getAvailableSpecialisations(String specType);

    List<SpecializationPlan> getAvailableSpecialisations(Integer mark);

    boolean canEntrableToHighEducation(Entrable entrable);
}
