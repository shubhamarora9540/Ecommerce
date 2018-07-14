package com.example.shubham.shubham_nav;

public class IndividualItemModel {

    private String item_name;
    private String in_stock;
    private int img;


    public IndividualItemModel() {
    }

    public IndividualItemModel(String item_name, String in_stock, int img) {
        this.item_name = item_name;
        this.in_stock = in_stock;
        this.img = img;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getIn_stock() {
        return in_stock;
    }

    public void setIn_stock(String in_stock) {
        this.in_stock = in_stock;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
