import java.util.Scanner;

public class tugas2_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int tarifMobil = 3000;
        final int tarifMotor = 2000;
        final int tarifTetap = 12500;
        String jenisKendaraan;
        int durasi;
        int totalBayar = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (mobil/motor, ketik 0 untuk selesai): ");
            jenisKendaraan = sc.nextLine();

            // Kondisi berhenti
            if (jenisKendaraan.equals("0")) {
                System.out.println("Program selesai. Total pembayaran parkir hari ini: Rp " + totalBayar);
                break;
            }

            // Validasi input kendaraan
            if (!jenisKendaraan.equalsIgnoreCase("mobil") && !jenisKendaraan.equalsIgnoreCase("motor")) {
                System.out.println("Jenis kendaraan tidak valid! Silakan input ulang.");
                continue;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();
            sc.nextLine(); // bersihkan buffer

            int bayar;
            if (durasi > 5) {
                bayar = tarifTetap;
            } else {
                if (jenisKendaraan.equalsIgnoreCase("mobil")) {
                    bayar = durasi * tarifMobil;
                } else {
                    bayar = durasi * tarifMotor;
                }
            }

            totalBayar += bayar;
            System.out.println("Biaya parkir kendaraan ini: Rp " + bayar);
            System.out.println("Total sementara: Rp " + totalBayar);
            System.out.println("--------------------------------");
        }

        sc.close();
    }
}
