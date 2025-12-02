package jobsheet11;

public class PengunjungCafe23 {

    // Fungsi varargs untuk menampilkan daftar pengunjung
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");

        // MODIFIKASI: menggunakan for-each loop
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }

        System.out.println(); // biar rapi
    }

    public static void main(String[] args) {

        // Pemanggilan sesuai Percobaan 4 langkah 3
        daftarPengunjung("Ali", "Budi", "Citra");

        // Tambahan sesuai langkah 5
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");

        // Test tambahan: tanpa argumen (untuk menjawab pertanyaan nomor 4)
        daftarPengunjung();
    }
}
