package com.solvd.university.impl;

import com.solvd.university.*;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentServiceImpl implements EnrollmentService {

    private List<SpecializationPlan> specializationPlans;
    private List<EntrantForm> entrantForms;

    public EnrollmentServiceImpl(List<SpecializationPlan> specializationPlans) {
        this.specializationPlans = specializationPlans;
    }

    public List<SpecializationPlan> getSpecializationPlans() {
        return specializationPlans;
    }

    public void setSpecializationPlans(List<SpecializationPlan> specializationPlans) {
        this.specializationPlans = specializationPlans;
    }

    public List<EntrantForm> getEntrantForms() {
        return entrantForms;
    }

    public void setEntrantForms(List<EntrantForm> entrantForms) {
        this.entrantForms = entrantForms;
    }

    /**
     * @param specType Possible inputs: 'full', 'distance'
     */
    @Override
    public List<SpecializationPlan> getAvailableSpecialisations(String specType) {
        List<SpecializationPlan> availablePlans = new ArrayList<>();
        String specTypeClass;
        switch (specType) {
            case "full":
                specTypeClass = "FullTimeSpecializationPlan";
                break;
            case "distance":
                specTypeClass = "DistanceSpecializationPlan";
                break;
            default:
                specTypeClass = "";
        }
        for (SpecializationPlan sp : specializationPlans) {
            if (sp.getClass().getSimpleName().equals(specTypeClass)) {
                availablePlans.add(sp);
            }
        }
        return availablePlans;
    }

    @Override
    public List<SpecializationPlan> getAvailableSpecialisations(Integer mark) {
        List<SpecializationPlan> availableSpecByType =
                this.getAvailableSpecialisations("FullTimeSpecializationPlan");
        List<SpecializationPlan> availableSpecByMark =
                new ArrayList<>();
        int spIndex = 0;
        for (SpecializationPlan sp : availableSpecByType) {
            if (((FullTimeSpecializationPlan) sp).getMinMark().equals(mark)) {
                availableSpecByMark.add(sp);
                spIndex++;
            }
        }
        return availableSpecByMark;
    }

    @Override
    public boolean canEntrableToHighEducation(Entrable entrable) {
        return entrable.isCanEntrateByAge();
    }
}
