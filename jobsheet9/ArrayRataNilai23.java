package jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;

        // Input nilai ke dalam array
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        // Menghitung total
        for (int i = 0; i < 10; i++) {
            total += nilaiMhs[i];
        }

        // Menghitung rata-rata
        rata2 = total / nilaiMhs.length;

        System.out.println("Rata-rata nilai mahasiswa = " + rata2);
    }
}
