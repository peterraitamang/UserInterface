package com.example.userinterface.model;

import java.util.ArrayList;

public class PopularSearchData {
    private String txtPost,txtDesignation,txtQuantity ;

    public String getTxtPost() {
        return txtPost;
    }

    public String getTxtDesignation() {
        return txtDesignation;
    }

    public String getTxtQuantity() {
        return txtQuantity;
    }

    public PopularSearchData(String txtPost, String txtDesignation, String txtQuantity) {
        this.txtPost = txtPost;
        this.txtDesignation = txtDesignation;
        this.txtQuantity = txtQuantity;
    }

}
