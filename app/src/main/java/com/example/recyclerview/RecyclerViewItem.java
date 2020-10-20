package com.example.recyclerview;

//оздали класс для связывая Ресайклер Вью xml
public class RecyclerViewItem {


    private int imageResource;
    private String text1;
    private String text2;


    public RecyclerViewItem(int imageResource, String text1, String text2) {
        this.imageResource = imageResource;
        this.text1 = text1;
        this.text2 = text2;
    }


    //делаем гетеры и сетерыдля обращения к ним, изменить параметры можно только в это классе, так как они приватны
    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}
