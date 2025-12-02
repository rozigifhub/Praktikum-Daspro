package jobsheet11;

public class Kafe23 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {

        System.out.println("Selamat datang, " + namaPelanggan + "!");

        // Cek status member
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        // Cek kode promo
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode Promo Valid: Diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode Promo Valid: Diskon 30%");
        } else {
            System.out.println("Kode Promo Invalid!");
        }

        // Menampilkan menu
        System.out.println("\n===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("===========================\n");
    }

    public static void main(String[] args) {

        // Nomor 7: Panggilan fungsi sesuai soal
        Menu("Budi", true, "DISKON30");
    }
}
