
# 💼 Polymorphic Employee Payroll Java

Demonstrasi Polimorfisme dan Abstraksi untuk Penggajian Pegawai di Java.

## 📖 Deskripsi Proyek

Proyek Java yang menunjukkan penggunaan **abstraksi** dan **polimorfisme** dalam pengelolaan data pegawai dengan berbagai status: **Manajer**, **Pemasaran**, dan **Honorer**. Program ini menghitung total gaji berdasarkan gaji pokok dan tunjangan spesifik untuk setiap jenis pegawai.

### 📁 Fitur Utama:
- 📊 **Pegawai.java**: Kelas abstrak induk dengan atribut `NPP`, `nama`, `gajiPokok`, dan metode abstrak `getStatus()`, `getTunjangan()`, dan `hitungGaTot()`.
- 👨‍💼 **Manajer.java**: Menghitung total gaji berdasarkan gaji pokok, tunjangan jabatan, dan lemburan.
- 📈 **Pemasaran.java**: Menghitung total gaji berdasarkan gaji pokok dan bonus.
- 👷‍♂️ **Honorer.java**: Menghitung total gaji berdasarkan gaji pokok dan lemburan.
- 🛠️ **mainPegawai.java**: Kelas utama yang membuat array pegawai dan menampilkan detail penggajian menggunakan **polimorfisme**.

---

## 🧠 Teknologi

- Java ☕

---

## 📂 Struktur Proyek

```
Polymorphic_Employee_Payroll_Java/
├── src/Modul_9/
├── mainPegawai.java        # 🛠️ Kelas utama
├── Pegawai.java            # 📊 Kelas abstrak induk
├── Manajer.java            # 👨‍💼 Kelas turunan untuk manajer
├── Pemasaran.java          # 📈 Kelas turunan untuk pemasaran
├── Honorer.java            # 👷‍♂️ Kelas turunan untuk honorer
```

---

## 🟢 Catatan

- Program menggunakan data statis untuk membuat array pegawai:
  - Manajer: `NPP: 235314099`, `Nama: Eugenius`, `Gaji Pokok: 5.000.000`, `Tunjangan Jabatan: 2.000.000`, `Lemburan: 1.000.000`
  - Pemasaran: `NPP: 235314098`, `Nama: Sisko`, `Gaji Pokok: 4.000.000`, `Bonus: 1.000.000`
  - Honorer: `NPP: 235314097`, `Nama: Coki`, `Gaji Pokok: 3.000.000`, `Lemburan: 500.000`
- Polimorfisme diterapkan melalui array `Pegawai[]` yang menyimpan berbagai objek turunan.
- `Pegawai` adalah kelas abstrak yang tidak dapat diinstansiasi langsung.

---

## 📈 Contoh Output

```
Data Pegawai:
1. 235314099 Eugenius Manajer 5000000.0 3000000.0 8000000.0
2. 235314098 Sisko Pemasaran 4000000.0 1000000.0 5000000.0
3. 235314097 Coki Honorer 3000000.0 500000.0 3500000.0
```

---

## 👨‍💻 Pengembang

**MBAHSINGO22**  
🔗 [GitHub](https://github.com/MBAHSINGO22)
