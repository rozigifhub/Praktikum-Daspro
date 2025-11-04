package jobsheet8;
import java.util.Scanner;

public class kopiSenja23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah cabang: ");
        int cabang = sc.nextInt();

        int totalSeluruhPelanggan = 0;
        int totalSeluruhItem = 0;

        for (int i = 1; i <= cabang; i++) {
            System.out.println("\nCabang ke-" + i);
            System.out.print("Masukkan jumlah pelanggan hari ini: ");
            int pelanggan = sc.nextInt();
            totalSeluruhPelanggan += pelanggan;

            int totalItemCabang = 0;

            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("  Jumlah item yang dipesan pelanggan ke-" + j + ": ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            System.out.println("Total item terjual di cabang ke-" + i + " = " + totalItemCabang);
            totalSeluruhItem += totalItemCabang;
        }

        System.out.println("\n=== Ringkasan Penjualan ===");
        System.out.println("Total seluruh pelanggan: " + totalSeluruhPelanggan);
        System.out.println("Total seluruh item terjual: " + totalSeluruhItem);
    }
}
