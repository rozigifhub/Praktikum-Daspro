package jobsheet10;

import java.util.Scanner;

public class SurveiKepuasan23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        int[][] survei = new int[jumlahResponden][jumlahPertanyaan];

        System.out.println("=== Input Data Survei Kepuasan Pelanggan ===");

        // Input data survei
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("\nResponden ke-" + (i + 1));

            for (int j = 0; j < jumlahPertanyaan; j++) {
                while (true) {
                    System.out.print("Jawaban pertanyaan " + (j + 1) + " (1-5): ");
                    int jawaban = sc.nextInt();

                    if (jawaban >= 1 && jawaban <= 5) {
                        survei[i][j] = jawaban;
                        break;
                    } else {
                        System.out.println("Input tidak valid! Jawaban harus 1-5.");
                    }
                }
            }
        }

        // Tampilkan hasil survei
        System.out.println("\n=== TABEL HASIL SURVEI ===");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.print("Responden " + (i + 1) + ": ");

            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print(survei[i][j] + " ");
            }
            System.out.println();
        }
    }
}
