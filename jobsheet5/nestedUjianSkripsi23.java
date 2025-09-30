package jobsheet5;
import java.util.Scanner;
public class nestedUjianSkripsi23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;
        System.out.println("Apakah mahasiswa sudah kompen (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();
        System.out.println("Masukkan jumlah log Pembingbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.println("Masukkan jumlah log Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")){
            if(bimbinganP1 >= 8 && bimbinganP2 >= 4){
                pesan = "Semua syarat terpenuhi, mahasiswa boleh ujian skripsi";
            }else if(bimbinganP1 < 8 && bimbinganP2 < 4){
                pesan = "Gagal! log bimbingan P1 kurang dari 8 dan log bimbingan P2 kurang dari 4 ";
            }else if (bimbinganP1 < 8){
                pesan = "Gagal! log bimbingan P1 kurang dari 8";
            }else{
                pesan = "Gagal! log bimbingan P2 kurang dari 4";
            }
        }else{
            pesan = "Gagal! mahasiswa masih ada tanggungan kompen";
        }
        System.out.println(pesan);
        sc.close();
    }

    
}
