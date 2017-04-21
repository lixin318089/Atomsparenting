package com.wl.atomsparenting.domain;

/**
 * Created by le on 2017/4/10.
 */

public class Griddomaiozhao {
    private int img;
    private String title;
    private int number;

    @Override
    public String toString() {
        return "Griddomaiozhao{" +
                "img=" + img +
                ", title='" + title + '\'' +
                ", number=" + number +
                '}';
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Griddomaiozhao() {


    }

    public Griddomaiozhao(int img, String title, int number) {

        this.img = img;
        this.title = title;
        this.number = number;
    }
}
