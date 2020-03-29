package com.example.shubham.shubham_nav;

public class ItemGridModel {
    private String image;
    private String itemname;
    private double rate;
    private int quantity;
    private double amount;


    public ItemGridModel() {

    }

    public ItemGridModel(String image, String itemname, double rate, int quantity, double amount) {
        this.image = image;
        this.itemname = itemname;
        this.rate = rate;
        this.quantity = quantity;
        this.amount = amount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
