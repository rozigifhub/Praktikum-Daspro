package jobsheet9;

import java.util.Scanner;

public class NilaiMahasiswa23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();

        int[] nilai = new int[jml];
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];

            if (nilai[i] > max) max = nilai[i];
            if (nilai[i] < min) min = nilai[i];
        }

        double rata = (double) total / jml;

        System.out.println("\n=== Hasil ===");
        System.out.println("Nilai mahasiswa: ");
        for (int n : nilai) {
            System.out.print(n + " ");
        }
        System.out.println("\nRata-rata: " + rata);
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
    }
}
