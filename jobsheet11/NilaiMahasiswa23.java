package jobsheet11;

import java.util.Scanner;

public class NilaiMahasiswa23 {

    // a. Fungsi isianArray
    public static void isianArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai mahasiswa:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    // b. Fungsi tampilArray
    public static void tampilArray(int[] arr) {
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int nilai : arr) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }

    // c. Fungsi hitTot
    public static int hitTot(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }

    // d. Fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        int[] nilaiMahasiswa = new int[N];

        // Memanggil fungsi-fungsi
        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);

        int totalNilai = hitTot(nilaiMahasiswa);

        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);
    }
}
