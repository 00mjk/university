package com.solvd.askomar.university.impl;

import com.solvd.askomar.university.*;

public class InformationCommiteeServiceImpl implements InformationCommiteeService {

    public String getSpecializationPlanInfo(SpecializationPlan specializationPlan) {
        return specializationPlan.toString();
    }

    public String getEducationIntstituteInfo(EducationalInstitution educationalInstitution) {
        return educationalInstitution.toString();
    }

    public String getPersonShortName(Person person) {
        return person.shortNameFormat();
    }

    public String getSpecialisationAccessibility(Accessible accessible) {
        String freePlacesResult = accessible.isFreePlacesAccessible() ? "PRESENT" : "NOT PRESENT";
        String paidPlacesResult = accessible.isPaidPlacesAccessible() ? "PRESENT" : "NOT PRESENT";
        return String.format("Free places: %s. Paid places: %s", freePlacesResult, paidPlacesResult);
    }

    public String askAboutCurrentDateTime(Askable askable) {
        String date = askable.sayCurrentDate();
        String time = askable.sayCurrentTime();
        return String.format("Today's date is: %s, time - %s", date, time);
    }

    public boolean isValidDocument(Checkable checkable) {
        return checkable.isValidDate() && checkable.isValidIdentificator();
    }

    public String getAbbreviation(Abbreviable abbreviable) {
        return abbreviable.getAbbreviation() + ". abbreviate by askomar";
    }
}