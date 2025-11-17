package jobsheet10;

import java.util.Scanner;

public class SIAKAD23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan jumlah siswa: ");
        int jmlMhs = sc.nextInt();
        System.out.println("masukkan jumlah matkul: ");
        int jmlMatkul = sc.nextInt();

        int[][] nilai = new int[jmlMhs][jmlMatkul];

        // Input nilai mahasiswa
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            // Rata-rata per mahasiswa
            System.out.println("Nilai rata-rata: " + (totalPerSiswa / jmlMatkul));
            System.out.println();
        }

        // Rata-rata per mata kuliah
        System.out.println("\n===============================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jmlMhs; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.printf("Mata Kuliah %d: %.2f \n" ,(j + 1),(totalPerMatkul / jmlMhs));
        }

    }
}
