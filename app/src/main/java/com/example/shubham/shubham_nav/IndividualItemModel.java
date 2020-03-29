package com.example.shubham.shubham_nav;

public class IndividualItemModel {

    private int id;
    private String item_name;
    private double price;
    private int quantity;
    private String shortdesc;
    private String img;



    public IndividualItemModel() {
    }

    public IndividualItemModel(int id, String item_name, double price, int quantity, String shortdesc, String img) {
        this.id = id;
        this.item_name = item_name;
        this.price = price;
        this.quantity = quantity;
        this.shortdesc = shortdesc;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public void setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc;
    }
}
