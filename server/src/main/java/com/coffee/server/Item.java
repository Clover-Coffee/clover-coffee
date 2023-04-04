package com.coffee.server;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.Valid;

public class Item {
    private int id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @Min(0)
    private int price;

    @NotNull
    private String image;

    public Item(int id, String name, String description, int price, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(@Valid @NotNull int price2) {
        this.price = price2;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
