package jobsheet8;

import java.util.Scanner;

public class nilaiKelompok23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;             
        double totalNilai;      
        double rataNilai;       
        double nilaiTertinggi = 0;
        int kelompokTertinggi = 0;
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

            // Mencari nilai tertinggi
            if (rataNilai > nilaiTertinggi) {
                nilaiTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

            i++;
        }

        System.out.println("\n=== Semua kelompok telah dinilai ===");
        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Kelompok dengan rata-rata tertinggi adalah kelompok " + kelompokTertinggi);
        System.out.println("Dengan rata-rata nilai = " + nilaiTertinggi);
    }
}

