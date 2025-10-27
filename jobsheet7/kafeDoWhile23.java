import java.util.Scanner;

public class kafeDoWhile23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        final int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.print("\nMasukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan. Program selesai.");
                break;
            }

            System.out.print("Masukkan jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Masukkan jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Masukkan jumlah roti: ");
            roti = sc.nextInt();

            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga pembelian: Rp " + totalHarga);

            sc.nextLine(); // Membersihkan newline
        } while (true);

        sc.close();
    }
}

