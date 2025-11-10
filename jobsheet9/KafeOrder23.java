package jobsheet9;

import java.util.Scanner;

public class KafeOrder23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine(); // bersihkan buffer

        String[] namaPesanan = new String[jmlPesanan];
        double[] hargaPesanan = new double[jmlPesanan];
        double total = 0;

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Harga " + namaPesanan[i] + ": ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();

            total += hargaPesanan[i];
        }

        System.out.println("\n=== Daftar Pesanan ===");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }
        System.out.println("Total Biaya: Rp" + total);
    }
}
