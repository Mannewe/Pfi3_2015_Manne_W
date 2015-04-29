package com.example.manne.assignment4;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by Manne on 2015-04-23.
 */
public class PlanetObject implements Serializable {

    private String name;
    private String description;
    private int image;
    private String radius;
    private String temp;

    public PlanetObject(String name, String description, String radius, String temp, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.radius = radius;
        this.temp = temp;
    }



    public int getImage() {
        return image;
    }


    public String getRadius() {
        return radius;
    }


    public String getTemp() {
        return temp;
    }


    public String getDescription() {
        return description;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
