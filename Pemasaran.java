package Modul_9;

public class Pemasaran extends Pegawai {
    // Atribut untuk menyimpan bonus pemasaran
    private double bonus;

    // Metode getter untuk mendapatkan bonus pemasaran
    double getBonus() {
        return bonus; // Mengembalikan nilai dari atribut bonus
    }

    // Metode setter untuk mengatur bonus pemasaran
    void setBonus(double myBonus) {
        bonus = myBonus; // Mengatur nilai dari atribut bonus
    }

    // Metode untuk menghitung total gaji pemasaran
    double hitungGaTot() {
        return getGapok() + bonus; // Mengembalikan total gaji pemasaran
    }

    // Metode untuk mendapatkan total tunjangan pemasaran
    double getTunjangan() {
        return bonus; // Mengembalikan nilai dari atribut bonus sebagai total tunjangan
    }

    // Metode untuk mendapatkan status pemasaran
    String getStatus() {
        return "Pemasaran"; // Mengembalikan string "Pemasaran" sebagai status pemasaran
    }
}

