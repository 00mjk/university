package com.solvd.university.impl;

import com.solvd.university.*;

public class InformationCommiteeServiceImpl implements InformationCommiteeService {

    @Override
    public String getSpecializationPlanInfo(SpecializationPlan specializationPlan) {
        return specializationPlan.toString();
    }

    @Override
    public String getEducationIntstituteInfo(EducationalInstitution educationalInstitution) {
        return educationalInstitution.toString();
    }

    @Override
    public String getPersonShortName(Person person) {
        return person.shortNameFormat();
    }

    @Override
    public String getSpecialisationAccessibility(Accessible accessible) {
        String freePlacesResult = accessible.isFreePlacesAccessible() ? "PRESENT" : "NOT PRESENT";
        String paidPlacesResult = accessible.isPaidPlacesAccessible() ? "PRESENT" : "NOT PRESENT";
        return String.format("Free places: %s. Paid places: %s", freePlacesResult, paidPlacesResult);
    }

    @Override
    public String askAboutCurrentDateTime(Askable askable) {
        String date = askable.sayCurrentDate();
        String time = askable.sayCurrentTime();
        return String.format("Today's date is: %s, time - %s", date, time);
    }

    @Override
    public boolean isValidDocument(Checkable checkable) {
        return checkable.isValidDate() && checkable.isValidIdentificator();
    }

    @Override
    public String getAbbreviation(Abbreviable abbreviable) {
        return abbreviable.getAbbreviation() + ". abbreviate by askomar";
    }
}
