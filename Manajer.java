package Modul_9;

public class Manajer extends Pegawai {
    // Atribut untuk menyimpan tunjangan jabatan manajer
    private double tunjanganJabatan;
    // Atribut untuk menyimpan lemburan manajer
    private double lemburan;

    // Metode getter untuk mendapatkan tunjangan jabatan manajer
    double getTunJab() {
        return tunjanganJabatan; // Mengembalikan nilai dari atribut tunjanganJabatan
    }

    // Metode getter untuk mendapatkan lemburan manajer
    double getLembur() {
        return lemburan; // Mengembalikan nilai dari atribut lemburan
    }

    // Metode setter untuk mengatur tunjangan jabatan manajer
    void setTunJab(double honJab) {
        tunjanganJabatan = honJab; // Mengatur nilai dari atribut tunjanganJabatan
    }

    // Metode setter untuk mengatur lemburan manajer
    void setLembur(double overtime) {
        lemburan = overtime; // Mengatur nilai dari atribut lemburan
    }

    // Metode untuk menghitung total gaji manajer
    double hitungGaTot() {
        return getGapok() + tunjanganJabatan + lemburan; // Mengembalikan total gaji manajer
    }

    // Metode untuk mendapatkan total tunjangan manajer
    double getTunjangan() {
        return tunjanganJabatan + lemburan; // Mengembalikan total tunjangan manajer
    }

    // Metode untuk mendapatkan status manajer
    String getStatus() {
        return "Manajer"; // Mengembalikan string "Manajer" sebagai status manajer
    }
}
