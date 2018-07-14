package com.example.shubham.shubham_nav;

public class ItemGridModel {
    private int image;
    private String itemname;
    private String rate;
    private String quantity;
    private String amount;


    public ItemGridModel() {

    }

    public ItemGridModel(int image, String itemname, String rate, String quantity, String amount) {
        this.image = image;
        this.itemname = itemname;
        this.rate = rate;
        this.quantity = quantity;
        this.amount = amount;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
