package com.example.shubham.shubham_nav;

import android.widget.Toast;

public class CategoryModel {

private String name;
private String desc;
private String image;



    public CategoryModel() {
    }

    public CategoryModel(String name, String desc, String image) {
        this.name = name;
        this.desc = desc;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImage(String image) {
        this.image = image;

    }
}
