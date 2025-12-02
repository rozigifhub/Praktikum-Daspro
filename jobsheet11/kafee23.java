package jobsheet11;

public class kafee23 {
    
}
package jobsheet11;

import java.util.Scanner;

public class KafeNoPresensi {

    // Menampilkan menu
    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15000");
        System.out.println("2. Cappucino - Rp 20000");
        System.out.println("3. Latte - Rp 22000");
        System.out.println("4. Teh Tarik - Rp 12000");
        System.out.println("5. Roti Bakar - Rp 10000");
        System.out.println("6. Mie Goreng - Rp 18000");
        System.out.println("===========================");
    }

    // Fungsi menghitung total harga (dengan kode promo)
    public static int hitungTotalHargaNoPresensi(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;

        // Cek kode promo
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid: DISKON50 (Diskon 50%)");
            totalHarga = totalHarga / 2;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid: DISKON30 (Diskon 30%)");
            totalHarga = totalHarga - (totalHarga * 30 / 100);
        } else {
            System.out.println("Kode promo invalid! Tidak ada diskon.");
        }

        return totalHarga;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();

        System.out.print("\nBerapa jenis menu yang ingin Anda pesan? ");
        int jumlahJenis = sc.nextInt();

        int totalKeseluruhan = 0;

        for (int i = 1; i <= jumlahJenis; i++) {
            System.out.println("\nPesanan ke-" + i);

            System.out.print("Masukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            System.out.print("Masukkan kode promo (atau '-' jika tidak ada): ");
            String kodePromo = sc.next();

            int total = hitungTotalHargaNoPresensi(pilihanMenu, banyakItem, kodePromo);

            System.out.println("Total harga menu ke-" + i + ": Rp " + total);

            totalKeseluruhan += total;
        }

        System.out.println("\n====================================");
        System.out.println("TOTAL KESELURUHAN SEMUA PESANAN: Rp " + totalKeseluruhan);
        System.out.println("====================================");
    }
}
