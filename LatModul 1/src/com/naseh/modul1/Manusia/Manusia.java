package com.naseh.modul1.Manusia;

public class Manusia {
    private String nama;
    private int umur;

    //Constuctor Pertama
    public Manusia(){}

    //Constuctor Kedua
    public Manusia(String nama) {
        this.nama = nama;
    }

    //Constuctor Ketiga
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
