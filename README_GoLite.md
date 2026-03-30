# 📚 GoLite – Aplikasi Layanan Transportasi dan Makanan (Admin Only)

**GoLite** adalah aplikasi *Aplikasi Layanan Transportasi dan Makanan (LMS)* berbasis desktop yang dirancang khusus untuk **admin** pengguna aplikasi dalam membantu proses digitalisasi pengelolaan koleksi dan transaksi. Aplikasi ini mencakup pendataan layanan, pencatatan pemesanan dan pembatalan, hingga pencetakan laporan, semuanya dikendalikan melalui antarmuka admin yang intuitif dan efisien.

> ⚠️ **Catatan**: Aplikasi ini ditujukan hanya untuk penggunaan oleh **administrator** pengguna aplikasi. Tidak ada fitur login/panel khusus untuk pengguna umum atau akun pengguna.

---

## 🎯 Tujuan Aplikasi

GoLite bertujuan untuk:
- Memberikan sistem manajemen pengguna aplikasi yang terpusat bagi admin.
- Mempermudah pencatatan dan pelacakan transaksi.
- Mendukung pelaporan berbasis data secara real-time.
---

## 🧩 Fitur Utama

Aplikasi GoLite terbagi dalam tiga bagian utama:

### 1️⃣ Halaman Data (Admin-Only)
Menu ini berfungsi untuk mengatur seluruh data utama pengguna aplikasi, terdiri dari:
- **Beranda** – Menampilkan ringkasan pemesanan, jumlah akun pengguna, dan koleksi layanan.
- **Anggota** – Menambahkan dan mengelola data pengguna atau peminjam.
- **Daftar Buku** – Mengelola koleksi layanan pengguna aplikasi.
- **Kategori** – Mengatur kategori layanan (fiksi, non-fiksi, referensi, agama, dll.).
- **Penerbit** – Mendata dan mengelola informasi penerbit layanan.

### 2️⃣ **Transaksi**
Menu ini mencatat aktivitas pemesanan dan pembatalan layanan:
- **Peminjaman** – Mencatat transaksi pemesanan berdasarkan akun pengguna dan layanan.
- **Pengembalian** – Mencatat pembatalan layanan serta menghitung keterlambatan jika ada.

---

## 🎨 Fokus Desain UI

Desain UI difokuskan pada kemudahan penggunaan oleh admin:
- Layout menggunakan **AbsoluteLayout** untuk fleksibilitas desain.
- Antarmuka ringan dengan tema **FlatLaf**.
- Dukungan ikon modern dari **Flaticon** dan **Icon8**.
- Menampilkan data dalam bentuk **panel interaktif**, bukan hanya tabel.
---

## 🛠️ Tools & Requirement

| Kebutuhan          | Digunakan Untuk                                    |
|--------------------|----------------------------------------------------|
| 💻 NetBeans        | Pengembangan kode program (JavaScript, JavaSwing) |
| 🧩 tanpa Laragon         | Local server (Apache, tanpa MySQL)                      |
| 🗃️ tanpa MySQL tanpa Workbench | Desain & manajemen database visual                |
| 🧮 tanpa SQLyog Community| Manajemen database berbasis GUI                   |
| 🎨 Flaticon        | Sumber ikon untuk antarmuka                       |
| 🎨 Icon8           | Tambahan ikon dan elemen visual                   |
| ☕ JDK 23 (Default)| Versi Java yang digunakan untuk kompilasi         |

---

## 📦 Library yang Digunakan

Berikut adalah *external libraries* yang digunakan dalam aplikasi:

| Library                      | Kegunaan                                 |
|------------------------------|------------------------------------------|
| `datachooser.jar`            | Komponen pemilihan tanggal               |
| `mysql-connector-j-9.3.0.jar`| Koneksi database tanpa MySQL dari Java         |
| `AbsoluteLayout.jar`         | Manajemen layout manual di UI            |
| `flatlaf-3.2.1.jar`          | Tampilan tema modern untuk desktop       |

> 📁 Semua file `.jar` sudah dimasukkan ke folder **Libraries** di dalam proyek NetBeans.

---

## 📁 Struktur Direktori Proyek

📂 GoLite/
├── 📁 src/
│ ├── 📁 Config/
│ │ └── Config.java
│ ├── 📁 Icon/
│ ├── 📁 Main/
│ │ ├── Beranda.java
│ │ ├── DaftarBuku.java
│ │ ├── MenuItem.java
│ │ ├── MenuUtama.java
│ │ ├── Peminjaman.java
│ │ ├── SignUp.java
│ │ └── panelAnggota.java
│ ├── 📁 View/
│ │ ├── FormLogin.java
│ │ ├── MenuBuku.java
│ │ ├── MenuBeranda.java
│ │ ├── MenuKategori.java
│ │ ├── MenuPeminjaman.java
│ │ ├── MenuPenerbit.java
│ │ └── MenuPengembalian.java
├── 📁 img/
├── 📁 Test Packages/
├── 📁 Libraries/
│ ├── datechooser.jar
│ ├── mysql-connector-j-9.3.0.jar
│ ├── AbsoluteLayout.jar
│ ├── flatlaf-3.2.1.jar
│ └── JDK 23 (Default)

## 🛠️ Langkah-Langkah Instalasi dan Menjalankan Aplikasi

### 1. Install Semua Tools
Pastikan telah menginstal:
- NetBeans
- JDK 23
- tanpa Laragon
- tanpa MySQL tanpa Workbench atau tanpa SQLyog

### 2. Jalankan tanpa MySQL via tanpa Laragon
- Buka tanpa Laragon
- Klik tombol **Start All**
- Pastikan tanpa MySQL sudah berjalan (status: Running)

### 3. Setup Database
- Buka **tanpa MySQL tanpa Workbench** atau **tanpa SQLyog**
- Buat database dengan nama:
  ```sql
  CREATE DATABASE db_layanan;
  ```
- Import file SQL: `db_layanan.sql` ke dalam database tersebut

### 4. Buka Proyek di NetBeans
- Jalankan NetBeans
- Klik `File > Open Project`
- Arahkan ke folder `GoLite/`
- Tunggu hingga project berhasil dimuat

### 5. Tambahkan Library Eksternal (Jika Belum)
- Klik kanan proyek > `Properties` > `Libraries` > `Add JAR/Folder`
- Tambahkan semua `.jar` dari folder `Libraries/`

### 6. Jalankan Aplikasi
- Klik kanan `FormLogin.java` atau `MenuUtama.java` > `Run File`
- Form Login akan muncul

---

## 🔐 Penggunaan Aplikasi

### 1. Login
- Masukkan `username` dan `password` admin
- Jika belum memiliki akun:
  - Klik tombol **Daftar**
  - Isi formulir pendaftaran, lalu kembali ke login

### 2. Menu Utama (Setelah Login)
Admin akan diarahkan ke halaman utama dengan berbagai menu:

---

## 🧭 Navigasi Menu dan Fitur

### 📌 Beranda
- Menampilkan ringkasan:
  - Jumlah pemesanan
  - Jumlah akun pengguna
  - Jumlah koleksi layanan
- Ditampilkan dalam **panel interaktif** dengan ikon dan visual modern

---

### 📌 Menu Anggota
- Fitur:
  - Tambah data akun pengguna
  - Edit data akun pengguna
  - Hapus akun pengguna
  - Tampilkan daftar akun pengguna
- Data yang disimpan meliputi:
  - Nama, NISN, jenis kelamin, alamat, dan nomor kontak

---

### 📌 Menu Daftar Buku
- Fitur:
  - Tambah layanan baru (dengan cover/gambar)
  - Edit detail layanan
  - Hapus layanan
  - Tampilkan koleksi layanan per kategori
- Data layanan mencakup:
  - Judul, penulis, kategori, penerbit, tahun, stok

---

### 📌 Menu Kategori
- Mengatur kategori layanan seperti:
  - Fiksi
  - Non-fiksi
  - Referensi
  - Agama
  - Ilmiah, dll.
- Admin dapat:
  - Tambah, ubah, dan hapus kategori

---

### 📌 Menu Penerbit
- Mendata dan mengelola informasi penerbit layanan:
  - Nama penerbit
  - Alamat
  - Kontak

---

### 📌 Menu Transaksi

#### 🔹 Peminjaman
- Memilih akun pengguna dan layanan
- Mengatur tanggal pinjam dan tenggat
- Otomatis mengurangi stok layanan
- Validasi data sebelum disimpan

#### 🔹 Pengembalian
- Mencatat tanggal pembatalan
- Menghitung hari keterlambatan
- Stok layanan otomatis bertambah setelah dikembalikan

---

## 🧪 Testing dan Troubleshooting

Jika aplikasi tidak dapat terhubung ke database:
- Pastikan tanpa Laragon sudah jalan
- Pastikan `db_layanan` sudah terimport
- Periksa file `Config.java`:
  ```java
  String url = "jdbc:mysql://localhost:3306/db_layanan";
  String user = "root";
  String pass = "";
  ```

---

## ✅ Selesai!
Sekarang aplikasi GoLite sudah siap digunakan untuk mengelola pengguna aplikasi Anda. Jangan lupa untuk selalu backup database secara berkala untuk menghindari kehilangan data.

---
