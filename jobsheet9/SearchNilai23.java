package jobsheet9;

import java.util.Scanner;

public class SearchNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Masukkan jml mahasiswa: ");
        int jmlMhs = sc.nextInt();


        System.out.print("Masukkan nilai: ");
        int[] nilai = new int[jmlMhs];
        boolean found = false;

        for (int j = 0; j < jmlMhs; j++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (j + 1) + " :");
            nilai[j] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari: ");
        int key = sc.nextInt();

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                found = true;
                System.out.println("Nilai " + key + " ketemu pada mahasiswa ke-" + (i + 1));
                break; // berhenti ketika nilai ditemukan
            }
        }

        if (!found) {
            System.out.println("Nilai " + key + " tidak ditemukan");
        }
    }
}
