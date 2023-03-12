package com.example.userinterface.model;

import android.content.Intent;

public class CategoriesData {
    private final String txtName;
    private final Integer image;

    public CategoriesData(String txtName, Integer image) {
        this.txtName = txtName;
        this.image = image;
    }

    public String getTxtName() {
        return txtName;
    }

    public Integer getImage() {
        return image;
    }
}
