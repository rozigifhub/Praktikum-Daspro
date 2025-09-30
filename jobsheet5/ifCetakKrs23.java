package jobsheet5;
import java.util.Scanner;
class ifCetakKrs23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---CETAK KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas (True/False): ");
        Boolean uktLunas = sc.nextBoolean();

        if (uktLunas){
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }

        sc.close();
    }
}