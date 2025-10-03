package Modul_9;

public class mainPegawai {
    public static void main(String[] args) {
        // Mendefinisikan jumlah pegawai
        int jumPeg = 3; 

        // Membuat array karyawan dengan ukuran sesuai jumlah pegawai
        Pegawai[] karyawan = new Pegawai[jumPeg];

        // Membuat objek Manajer, Pemasaran, dan Honorer dan menambahkannya ke array karyawan
        karyawan[0] = new Manajer();
        karyawan[0].setNpp(235314099);
        karyawan[0].setNama("Eugenius");
        karyawan[0].setGapok(5000000);
        ((Manajer) karyawan[0]).setTunJab(2000000);
        ((Manajer) karyawan[0]).setLembur(1000000);

        karyawan[1] = new Pemasaran();
        karyawan[1].setNpp(235314098);
        karyawan[1].setNama("Sisko");
        karyawan[1].setGapok(4000000);
        ((Pemasaran) karyawan[1]).setBonus(1000000);

        karyawan[2] = new Honorer();
        karyawan[2].setNpp(235314097);
        karyawan[2].setNama("Coki");
        karyawan[2].setGapok(3000000);
        ((Honorer) karyawan[2]).setLembur(500000);

        // Menampilkan data pegawai dan total gaji mereka
        System.out.println("Data Pegawai:");
        for (int i = 0; i < jumPeg; i++) {
            System.out.print((i + 1) + ". " + karyawan[i].getNpp() + " " + karyawan[i].getNama() + " ");
            // Menggunakan instanceof untuk menentukan jenis objek dan menampilkan informasi yang spesifik
            if (karyawan[i] instanceof Manajer) {
                Manajer man1 = (Manajer) karyawan[i];
                System.out.print("Manajer ");
                double tunjangan = man1.getTunJab() + man1.getLembur();
                System.out.println(karyawan[i].getGapok() + " " + tunjangan + " " + karyawan[i].hitungGaTot());
            } else if (karyawan[i] instanceof Pemasaran) {
                Pemasaran pem1 = (Pemasaran) karyawan[i];
                System.out.print("Pemasaran ");
                double tunjangan = pem1.getBonus();
                System.out.println(karyawan[i].getGapok() + " " + tunjangan + " " + karyawan[i].hitungGaTot());
            } else if (karyawan[i] instanceof Honorer) {
                Honorer hon1 = (Honorer) karyawan[i];
                System.out.print("Honorer ");
                double tunjangan = hon1.getLembur();
                System.out.println(karyawan[i].getGapok() + " " + tunjangan + " " + karyawan[i].hitungGaTot());
            }
        }
    }
}
