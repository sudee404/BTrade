package com.example.btrade;

public class StaticRecModel {
    private final int image;
    private final String text;

    public StaticRecModel(int image, String text) {
        this.image = image;
        this.text = text;
    }
    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

}
