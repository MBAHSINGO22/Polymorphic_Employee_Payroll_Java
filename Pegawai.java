package Modul_9;

public abstract class Pegawai {
    // Atribut untuk menyimpan nomor pegawai
    private int npp;
    // Atribut untuk menyimpan nama pegawai
    private String nama;
    // Atribut untuk menyimpan gaji pokok pegawai
    private double gajiPokok;

    // Metode getter untuk mendapatkan nomor pegawai
    int getNpp() {
        return npp; // Mengembalikan nilai dari atribut npp
    }

    // Metode getter untuk mendapatkan nama pegawai
    String getNama() {
        return nama; // Mengembalikan nilai dari atribut nama
    }

    // Metode getter untuk mendapatkan gaji pokok pegawai
    double getGapok() {
        return gajiPokok; // Mengembalikan nilai dari atribut gajiPokok
    }

    // Metode setter untuk mengatur nomor pegawai
    void setNpp(int nopeg) {
        npp = nopeg; // Mengatur nilai dari atribut npp
    }

    // Metode setter untuk mengatur nama pegawai
    void setNama(String nampeg) {
        nama = nampeg; // Mengatur nilai dari atribut nama
    }

    // Metode setter untuk mengatur gaji pokok pegawai
    void setGapok(double upah) {
        gajiPokok = upah; 
    }

    // Metode abstrak untuk mendapatkan status pegawai
    abstract String getStatus(); 

    // Metode abstrak untuk mendapatkan tunjangan pegawai
    abstract double getTunjangan(); 

    // Metode abstrak untuk menghitung total gaji pegawai
    abstract double hitungGaTot(); 
}

