package com.naseh.modul1;

//class main/ demo class
public class Objek {
    public static void main(String[] args) {
        //Deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Naseh");
        mahasiswaTanpa.setNim(19104003);

        //getter buat ngambil datanya
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());

        Mahasiswa mahasiswa = new Mahasiswa("Paimon", 848476130);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t:" + mahasiswa.getNama());
        System.out.println("Nim\t\t:" + mahasiswa.getNim());
    }

}
