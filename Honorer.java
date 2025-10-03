package Modul_9;

public class Honorer extends Pegawai {
    // Atribut untuk menyimpan lemburan honorer
    private double lemburan;

    // Metode getter untuk mendapatkan lemburan honorer
    double getLembur() {
        return lemburan; // Mengembalikan nilai dari atribut lemburan
    }

    // Metode setter untuk mengatur lemburan honorer
    void setLembur(double myLembur) {
        lemburan = myLembur; // Mengatur nilai dari atribut lemburan
    }

    // Metode untuk menghitung total gaji honorer
    double hitungGaTot() {
        return getGapok() + lemburan; // Mengembalikan total gaji honorer
    }

    // Metode untuk mendapatkan total tunjangan honorer
    double getTunjangan() {
        return lemburan; // Mengembalikan nilai dari atribut lemburan sebagai total tunjangan
    }

    // Metode untuk mendapatkan status honorer
    String getStatus() {
        return "Honorer"; // Mengembalikan string "Honorer" sebagai status honorer
    }
}
