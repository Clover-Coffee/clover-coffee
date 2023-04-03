package com.coffee.coffee.model;

public class Item {
    private String title;
    private double price;
    private String description;
    private String imageKey;

    public Item() {
    }

    public Item(String title, double price, String description, String imageKey) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.imageKey = imageKey;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageKey() {
        return imageKey;
    }

    public void setImageKey(String imageKey) {
        this.imageKey = imageKey;
    }
}