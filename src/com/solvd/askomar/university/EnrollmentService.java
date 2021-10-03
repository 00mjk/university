package com.solvd.askomar.university;

public class EnrollmentService {

    SpecializationPlan[] specializationPlans;
    EntrantForm[] entrantForms;

    public EnrollmentService(SpecializationPlan[] specializationPlans) {
        this.specializationPlans = specializationPlans;
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
        boolean isCanEnrollToSpec = false;
        SpecializationPlan[] availableSpecialisations = getAvailableSpecialisations(entrant);
        for(int i = 0; i < availableSpecialisations.length; i++) {
            if(availableSpecialisations[i] == specializationPlan) {
                isCanEnrollToSpec = true;
            }
        }
        return isCanEnrollToSpec;
    }

    public boolean enrollSpecialisation(Entrant entrant, SpecializationPlan specializationPlan) {
        if(isCanEnrollToSpecialisation(entrant, specializationPlan)) {
            EntrantForm entrantForm = new EntrantForm(entrant, specializationPlan.getSpecialization(), false);
            this.entrantForms[EntrantForm.entrantFormsAmount] = entrantForm;
            EntrantForm.entrantFormsAmount++;
            return true;
        }
        return false;
    }
}
