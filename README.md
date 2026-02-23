# 📱 Tugas Kelompok 1 - Pemrograman Mobile (Android OS Explorer)

Aplikasi Android Sederhana yang menampilkan informasi mengenai Sejarah Android, Arsitektur Android, dan Deteksi Informasi Device secara otomatis. 

Dibuat untuk memenuhi tugas praktikum Pemrograman Mobile.

---

## ✨ Tampilan & Fitur Aplikasi

Aplikasi ini menggunakan `ViewPager2` sehingga pengguna dapat berpindah halaman hanya dengan menggeser (*swipe*) layar.

### 📜 Halaman 1: Sejarah Android
Menampilkan *timeline* ringkas sejarah perkembangan sistem operasi Android dari awal mula berdiri (2003) hingga saat ini.

<img width="1080" height="2400" alt="Screenshot_20260223_164414" src="https://github.com/user-attachments/assets/19d00388-107d-40bc-9f86-c2508e87bf5e" />

### ⚙️ Halaman 2: Arsitektur Android & Info Device
Menampilkan diagram tumpukan (*stack*) Arsitektur Android secara visual, beserta deteksi 6 informasi *hardware* dan sistem secara *real-time*:
1. Android Version
2. Device Model
3. Manufacturer / Brand
4. Kernel Version
5. Battery Level (%)
6. Network Status (Wi-Fi / Cellular / Offline)

<img width="1080" height="2400" alt="Screenshot_20260223_164445" src="https://github.com/user-attachments/assets/d585b6d9-6555-43cb-b45a-f65e88d9ae55" />

---

## 🛠️ Teknologi yang Digunakan
* **Bahasa Pemrograman:** Kotlin
* **IDE:** Android Studio
* **UI/Navigasi:** XML Layout & ViewPager2 (Fragments)
* **Perizinan Tambahan:** `android.permission.ACCESS_NETWORK_STATE` (Untuk deteksi status jaringan)

## 🚀 Cara Menjalankan Aplikasi
1. *Clone repository* ini ke laptop/komputer.
2. Buka **Android Studio**, pilih **Open**, dan arahkan ke folder *repository* ini.
3. Tunggu proses *Gradle Sync* selesai.
4. Klik tombol **Run** (Segitiga Hijau) untuk menjalankan aplikasi di Emulator.
