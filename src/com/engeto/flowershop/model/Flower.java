package com.engeto.flowershop.model;

import java.awt.*;

public class Flower {

    private static int nextId = 1;
    private int id;
    private String name;
    private Color color;
    private String description;
    private boolean isPoisonous;

    public Flower(int id, String name, Color color, String description, boolean isPoisonous) {
        this.id = nextId++;
        this.name = name;
        this.color = color;
        this.description = description;
        this.isPoisonous = isPoisonous;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }
}
