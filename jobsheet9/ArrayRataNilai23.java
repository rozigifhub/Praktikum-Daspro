package jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int jmlLulus = 0;

        System.out.println("masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        // Input nilai ke dalam array
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70){
                jmlLulus += 1;
            }
        }

        // Menghitung total
        for (int i = 0; i < 10; i++) {
            total += nilaiMhs[i];
        }

        // Menghitung rata-rata
        rata2 = total / nilaiMhs.length;

        
        System.out.println("Jumlah Lulus: " + jmlLulus);
        System.out.println("Rata-rata nilai mahasiswa = " + rata2);
    }
}
