package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int pilih;

        while (true) {
            System.out.println("\n=== MENU BIOSKOP MINI ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // buang newline

            if (pilih == 1) {
                // MENU 1: INPUT PENONTON
                String nama;
                int baris, kolom;

                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();

                while (true) {
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine(); // buang newline

                    // Validasi baris & kolom tidak tersedia
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor kursi tidak tersedia! Coba lagi.");
                        continue;
                    }

                    // Cek apakah kursi sudah terisi
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi! Pilih kursi lain.");
                        continue;
                    }

                    // Kursi valid dan kosong → isi
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil ditambahkan.");
                    break;
                }

            } else if (pilih == 2) {
                // MENU 2: TAMPILKAN PENONTON
                System.out.println("\n=== DAFTAR PENONTON ===");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(isi + "\t");
                    }
                    System.out.println();
                }

            } else if (pilih == 3) {
                System.out.println("Program selesai. Terima kasih!");
                break;

            } else {
                System.out.println("Menu tidak valid!");
            }
        }
    }
}
