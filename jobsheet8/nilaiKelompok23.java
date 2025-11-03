package jobsheet8;

import java.util.Scanner;

public class nilaiKelompok23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;             
        double totalNilai;      
        double rataNilai;       

        while (i <= 6) {
            totalNilai = 0; 
            System.out.println("\nKelompok " + i);


            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai dari penilai ke-" + j + ": ");
                int nilai = sc.nextInt();
                totalNilai += nilai;
            }


            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai kelompok " + i + " = " + rataNilai);
            i++;
        }

        System.out.println("\n=== Semua kelompok telah dinilai ===");
    }
}

