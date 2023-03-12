package com.example.userinterface.model;

public class SearchDetailsData {
    private final String designation;
    private final int image;
    private final String initialSalary;
    private final String finalSalary;

    public String getDesignation() {
        return designation;
    }

    public int getImage() {
        return image;
    }

    public String getInitialSalary() {
        return initialSalary;
    }

    public String getFinalSalary() {
        return finalSalary;
    }

    public SearchDetailsData(String designation, int image, String initialSalary, String finalSalary) {
        this.designation = designation;
        this.image = image;
        this.initialSalary = initialSalary;
        this.finalSalary = finalSalary;
    }
}
