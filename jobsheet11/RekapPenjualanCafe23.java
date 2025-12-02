package jobsheet11;

import java.util.Scanner;

public class RekapPenjualanCafe23 {

    static Scanner sc = new Scanner(System.in);

    // Fungsi input data (array 2 dimensi)
    public static void inputData(int[][] penjualan, String[] menu) {
        System.out.println("=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < penjualan[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    // Fungsi tampilkan tabel penjualan
    public static void tampilkanTabel(int[][] penjualan, String[] menu) {
        System.out.println("\n=== TABEL PENJUALAN ===");
        System.out.print("Menu\t\t");
        for (int h = 1; h <= penjualan[0].length; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Fungsi cari menu penjualan tertinggi
    public static void menuTertinggi(int[][] penjualan, String[] menu) {
        int maxTotal = 0;
        String menuMax = "";

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuMax = menu[i];
            }
        }

        System.out.println("\nMenu dengan total penjualan tertinggi:");
        System.out.println(menuMax + " (Total: " + maxTotal + ")");
    }

    // Fungsi hitung rata-rata tiap menu
    public static void rataRataMenu(int[][] penjualan, String[] menu) {
        System.out.println("\n=== RATA-RATA PENJUALAN ===");
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rata = total / (double) penjualan[i].length;
            System.out.println(menu[i] + ": " + rata);
        }
    }

    public static void main(String[] args) {

        String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        int[][] penjualan = new int[5][7];

        inputData(penjualan, menu);
        tampilkanTabel(penjualan, menu);
        menuTertinggi(penjualan, menu);
        rataRataMenu(penjualan, menu);
    }
}
