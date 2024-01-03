package com.cat.crudapi.entity;

import java.util.Objects;

public class Cat {
    private int id;
    private String catName;
    private String catColor;
    private String catBirthDate;
    private String favoriteSnack;

    /*
     *猫の「名前」「毛色」「生年月日」「好物」
     */
    public Cat(int id, String catName, String catColor, String catBirthDate, String favoriteSnack) {
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

    public String getCatBirthDate() {
        return catBirthDate;
    }

    public String getFavoriteSnack() {
        return favoriteSnack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, catName, catColor, catBirthDate, favoriteSnack);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cat that = (Cat) obj;
        return Objects.equals(id, that.id) && Objects.equals(catName, that.catName) &&
                Objects.equals(catColor, that.catColor) && Objects.equals(catBirthDate, that.catBirthDate) &&
                Objects.equals(favoriteSnack, that.favoriteSnack);
    }
}
