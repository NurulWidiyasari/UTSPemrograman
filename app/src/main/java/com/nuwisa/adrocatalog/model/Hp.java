package com.nuwisa.adrocatalog.model;

public class Hp {
    private String jenis;
    private String tipe;
    private String sistemoperasi;
    private String deskripsi;
    private int drawableRes;

    public Hp(String jenis, String tipe, String asal, String deskripsi, int drawableRes) {
        this.jenis = jenis;
        this.tipe = tipe;
        this.sistemoperasi = asal;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.sistemoperasi = tipe;
    }

    public String getAsal() {
        return tipe;
    }

    public void setAsal(String asal) {
        this.sistemoperasi = asal;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
