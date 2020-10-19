package com.naseh.modul1.Pass;

public class TestPass {
    int nomor1;
    int nomor2;

    //Constractor
    public TestPass(int nomor1, int nomor2) {
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
    }

    //Pass by value, paramete berupa tipe data primitif
    public void calculate(int m, int n){
        m = n * 10;
        n = n / 2;
    }

    //Pass by reference, parameter berupa tipe data class
    public void calculate(TestPass pass){
        pass.nomor1 = pass.nomor1 * 10;
        pass.nomor2 = pass.nomor2 / 2;
    }

}
