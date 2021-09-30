package com.solvd.askomar.university;

// Специальность
public class Specialization {
    private String name;
    private Integer freePlacesAmount = 0;
    private Integer paidPlacesAmount = 0;
    private Double educationCost;
    //TODO Amount of years

    public Specialization(String name) {
        this.name = name;
    }

    public Specialization(String name, Integer freePlacesAmount) {
        this(name);
        this.setFreePlacesAmount(freePlacesAmount);
    }

    public Specialization(String name, Integer freePlacesAmount, Integer paidPlacesAmount, Double educationCost) {
        this(name, freePlacesAmount);
        this.setPaidPlacesAmount(paidPlacesAmount);
        this.setEducationCost(educationCost);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFreePlacesAmount() {
        return this.freePlacesAmount;
    }

    public void setFreePlacesAmount(Integer freePlacesAmount) {
        this.freePlacesAmount = freePlacesAmount;
    }

    public Integer getPaidPlacesAmount() {
        return this.paidPlacesAmount;
    }

    public void setPaidPlacesAmount(Integer paidPlacesAmount) {
        this.paidPlacesAmount = paidPlacesAmount;
    }

    public Double getEducationCost() {
        return this.educationCost;
    }

    public void setEducationCost(Double educationCost) {
        this.educationCost = educationCost;
    }
}
