# IQ Puzzle Solver

## 1. Deskripsi Singkat
IQ Puzzle Solver adalah program berbasis Java yang dirancang untuk menyelesaikan teka-teki susunan puzzle dalam sebuah papan berukuran MxN. Program ini menggunakan algoritma **brute force** dan **backtracking** untuk mencari solusi yang sesuai dengan aturan yang diberikan. Selain itu, program juga mencatat jumlah percobaan yang dilakukan, waktu eksekusi, serta menyimpan hasil solusi dalam format teks.

## 2. Requirement Program dan Instalasi
### **2.1. Requirement**
- **Java Development Kit (JDK) 8 atau lebih baru**
- **Terminal atau Command Prompt** yang mendukung ANSI untuk tampilan warna
- **Library Java Standar** (tanpa library eksternal)

### **2.2. Instalasi**
1. **Pastikan Java telah terinstal**
   ```sh
   java -version
   ```
   Jika belum terinstal, silakan unduh dan pasang dari [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) atau gunakan OpenJDK.

2. **Pastikan file program tersedia dalam satu folder**
   - `IQPuzzleSolver.java`
   - Folder `test/` untuk menyimpan file input
   - Folder `output/` untuk menyimpan hasil solusi

## 3. Cara Kompilasi Program
Program ini ditulis dalam **Java** dan perlu dikompilasi sebelum dijalankan. Untuk mengkompilasi:
```sh
javac -d bin src/IQPuzzleSolver.java
```
- Flag `-d bin` akan menyimpan file hasil kompilasi di dalam folder `bin/`.

## 4. Cara Menjalankan Program
Setelah dikompilasi, jalankan program menggunakan perintah berikut:
```sh
java -cp bin IQPuzzleSolver
```

### **4.1. Cara Menggunakan**
1. Jalankan program di terminal.
2. Masukkan nama file input yang berisi **spesifikasi puzzle**, misalnya:
   ```
   Masukkan nama file: testcase1
   ```
   - Program akan mencari file `test/testcase1.txt` sebagai input.
3. Program akan menampilkan solusi di terminal dan menyimpannya dalam:
   - **`output/result.txt`** → Berisi informasi waktu pencarian, jumlah kasus yang ditinjau, dan solusi.

## 5. Author
- **Nama**: Sabilul Huda
- **NIM**: 13523072
- **Email**: sabilulhuda060106@gmail.com
- **Universitas**: Institut Teknologi Bandung

Jika ada pertanyaan atau kendala, silakan hubungi melalui email atau media lain yang tersedia.
