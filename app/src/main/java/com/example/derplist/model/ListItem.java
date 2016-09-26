package com.example.derplist.model;

/**
 * java reprisentation of the data to be reprisented in the recuclerView
 * Created by Rashid on 24/09/2016.
 */

public class ListItem {
    private String title;
    private String subTitle;
    private int imageResId;
    private boolean favourite = false;

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
}
