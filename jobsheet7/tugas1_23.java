import java.util.Scanner;

public class tugas1_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int hargaTiket = 50000;
        int jumlahTiket;
        double totalHarga;
        String lanjut;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk keluar): ");
            jumlahTiket = sc.nextInt();

            // Jika input 0, keluar dari program
            if (jumlahTiket == 0) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            }

            // Jika input tidak valid
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan input ulang.");
                continue;
            }

            // Hitung total harga dan diskon
            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                totalHarga *= 0.85; // diskon 15%
                System.out.println("Diskon 15% diterapkan.");
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90; // diskon 10%
                System.out.println("Diskon 10% diterapkan.");
            }

            System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
            sc.nextLine(); // bersihkan buffer

            System.out.print("Apakah ingin input pelanggan lain? (ya/tidak): ");
            lanjut = sc.nextLine();

            if (lanjut.equalsIgnoreCase("tidak")) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            }

        } while (true);

        sc.close();
    }
}
