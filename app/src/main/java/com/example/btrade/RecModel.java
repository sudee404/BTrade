package com.example.btrade;

public class RecModel {
    private final int img2;
    private final String txt1;
    private final String txt2;
    private final String txt3;
    private final String txt4;

    public RecModel(int img2,String txt1,String txt2,String txt3,String txt4){
        this.img2= img2;
        this.txt1=txt1;
        this.txt2=txt2;
        this.txt3=txt3;
        this.txt4=txt4;

    }

    public int getImg2() {
        return img2;
    }

    public String getTxt1() {
        return txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public String getTxt3() {
        return txt3;
    }

    public String getTxt4() {
        return txt4;
    }
}
