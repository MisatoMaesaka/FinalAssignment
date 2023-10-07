package com.cat.crudapi.controller.response;

import com.cat.crudapi.entity.Cat;

import java.time.LocalDate;

public class CatResponse {
    private int id;

    private String catName;

    private String catColor;

    private LocalDate catBirthDate;

    private String favoriteSnack;

    /*
     *猫の「名前」「毛色」「生年月日」「好物」
     */
    public CatResponse(Cat cat) {
        this.catName = cat.getCatName();
        this.catColor = cat.getCatColor();
        this.catBirthDate = cat.getCatBirthDate();
        this.favoriteSnack = cat.getFavoriteSnack();
    }

    public String getCatName() {
        return catName;
    }

    public String getCatColor() {
        return catColor;
    }

    public LocalDate getCatBirthDate() {
        return catBirthDate;
    }

    public String getFavoriteSnack() {
        return favoriteSnack;
    }
}
