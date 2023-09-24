package com.cat.crudapi.entity;

import java.util.Date;

public class Cat {
    private int id;

    private String catName;

    private String catColor;

    private Date catBirthDate;

    private String favoriteSnack;

    /*
     *猫の「名前」「毛色」「生年月日」「好物」
     */
    public Cat(int id, String catName, String catColor, Date catBirthDate, String favoriteSnack) {
        this.id = id;
        this.catName = catName;
        this.catColor = catColor;
        this.catBirthDate = catBirthDate;
        this.favoriteSnack = favoriteSnack;
    }

    public int getId() {
        return id;
    }

    public String getCatName() {
        return catName;
    }

    public String getCatColor() {
        return catColor;
    }

    public Date getCatBirthDate() {
        return catBirthDate;
    }

    public String getFavoriteSnack() {
        return favoriteSnack;
    }
}
