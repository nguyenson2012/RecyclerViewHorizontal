package com.example.asus.recyclerviewhorizontal;

/**
 * Created by Asus on 7/25/2016.
 */
public class CategoryInfo {
    private int imageResource;
    private String title;

    public CategoryInfo(){}

    public CategoryInfo(String title, int imageResource) {
        this.title = title;
        this.imageResource = imageResource;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
