package com.example.shubham.shubham_nav;

public class insideModel {
    int id;
    String name;
    String shortdesc;
    double price;
    int quantity;
    String category;
    String image;

    public insideModel() {
    }

    public insideModel(int id, String name, String shortdesc, double price, int quantity, String category, String image) {
        this.id = id;
        this.name = name;
        this.shortdesc = shortdesc;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
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

    public String getShortdesc() {
        return shortdesc;
    }

    public void setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
