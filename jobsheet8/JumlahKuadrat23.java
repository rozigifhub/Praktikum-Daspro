import java.util.Scanner;

public class JumlahKuadrat23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int total = 0;// total seluruh kuadrat (opsional)
 
        for (int i = 1; i <= n; i++) {
            int jumlahKuadrat = 0; // total untuk baris i

            System.out.print("n = " + i + " -> Jumlah Kuadrat = ");
            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                System.out.print(kuadrat);
                jumlahKuadrat += kuadrat;

                if (j < i) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" = ");
                }
            }

            System.out.println(jumlahKuadrat);
            total = jumlahKuadrat; // kalau mau simpan hasil akhir (opsional)
        }

        System.out.println("Total kuadrat hingga n = " + total);
    }
}
