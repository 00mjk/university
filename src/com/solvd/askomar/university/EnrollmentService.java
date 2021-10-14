package com.solvd.askomar.university;

import java.util.List;

public interface EnrollmentService {

    List<SpecializationPlan> getAvailableSpecialisations(String specType);

    List<SpecializationPlan> getAvailableSpecialisations(Integer mark);

    boolean canEntrableToHighEducation(Entrable entrable);
}
