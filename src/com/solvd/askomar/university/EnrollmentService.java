package com.solvd.askomar.university;

public class EnrollmentService {

    private SpecializationPlan[] specializationPlans;
    private EntrantForm[] entrantForms;

    public EnrollmentService(SpecializationPlan[] specializationPlans) {
        this.specializationPlans = specializationPlans;
    }

    public SpecializationPlan[] getSpecializationPlans() {
        return specializationPlans;
    }

    public void setSpecializationPlans(SpecializationPlan[] specializationPlans) {
        this.specializationPlans = specializationPlans;
    }

    public EntrantForm[] getEntrantForms() {
        return entrantForms;
    }

    public void setEntrantForms(EntrantForm[] entrantForms) {
        this.entrantForms = entrantForms;
    }

    /**
     * @param specType Possible inputs: 'full', 'distance'
     */
    public SpecializationPlan[] getAvailableSpecialisations(String specType) {
        SpecializationPlan[] availablePlans = new SpecializationPlan[specializationPlans.length];
        int plansIndex = 0;
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
                availablePlans[plansIndex] = sp;
                plansIndex++;
            }
        }
        return availablePlans;
    }

    public SpecializationPlan[] getAvailableSpecialisations(Integer mark) {
        SpecializationPlan[] availableSpecByType =
                this.getAvailableSpecialisations("FullTimeSpecializationPlan");
        FullTimeSpecializationPlan[] availableSpecByMark =
                new FullTimeSpecializationPlan[availableSpecByType.length];
        int spIndex = 0;
        for (SpecializationPlan sp : availableSpecByType) {
            if (((FullTimeSpecializationPlan) sp).getMinMark().equals(mark)) {
                availableSpecByMark[spIndex] = (FullTimeSpecializationPlan) sp;
                spIndex++;
            }
        }
        return availableSpecByMark;
    }
}
