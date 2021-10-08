package com.solvd.askomar.university;

public interface EnrollmentService {

    SpecializationPlan[] getAvailableSpecialisations(String specType);

    SpecializationPlan[] getAvailableSpecialisations(Integer mark);

    boolean canEntrableToHighEducation(Entrable entrable);
}
