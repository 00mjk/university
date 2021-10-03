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

    public SpecializationPlan[] getAvailableSpecialisations(Entrant entrant) {
        SpecializationPlan[] availablePlans = new SpecializationPlan[specializationPlans.length];
        int specIndex = 0;
        for (int i = 0; i < specializationPlans.length; i++) {
            if (specializationPlans[i].getFreePlacesAmount() > 0 && entrant.getSumMark() >= specializationPlans[i].getMinMark()) {
                availablePlans[specIndex] = specializationPlans[i];
                specIndex++;
            }
        }
        return availablePlans;
    }

    public SpecializationPlan[] getAvailableSpecialisations(Entrant entrant, Double educationMaxCost) {
        SpecializationPlan[] availablePlans = new SpecializationPlan[specializationPlans.length];
        int specIndex = 0;
        for (int i = 0; i < specializationPlans.length; i++) {
            if (specializationPlans[i].getPaidPlacesAmount() > 0) {
                if (specializationPlans[i].getPaidCost() <= educationMaxCost) {
                    availablePlans[specIndex] = specializationPlans[i];
                    specIndex++;
                }
            }
        }
        return availablePlans;
    }

    public boolean isCanEnrollToSpecialisation(Entrant entrant, SpecializationPlan specializationPlan) {
        boolean canEnrollToSpec = false;
        SpecializationPlan[] availableSpecialisations = getAvailableSpecialisations(entrant);
        for(int i = 0; i < availableSpecialisations.length; i++) {
            if(availableSpecialisations[i] == specializationPlan) {
                canEnrollToSpec = true;
            }
        }
        return canEnrollToSpec;
    }

    public boolean enrollSpecialisation(Entrant entrant, SpecializationPlan specializationPlan) {
        boolean canEnroll = isCanEnrollToSpecialisation(entrant, specializationPlan);
        if(canEnroll) {
            EntrantForm entrantForm = new EntrantForm(entrant, specializationPlan.getSpecialization(), false);
            this.entrantForms[EntrantForm.entrantFormsAmount] = entrantForm;
            EntrantForm.entrantFormsAmount++;
        }
        return canEnroll;
    }
}
