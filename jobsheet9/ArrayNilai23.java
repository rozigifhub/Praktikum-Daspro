package jobsheet9;
import java.util.Scanner;

public class ArrayNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        // Input nilai ke dalam array
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Daftar nilai akhir mahasiswa:");

        // Menampilkan isi array
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-" + (i + 1) + " = " + nilaiAkhir[i]);
        }
    }
}
