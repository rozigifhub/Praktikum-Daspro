package jobsheet9;

import java.util.Scanner;

public class CariMenuKafe23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        System.out.println("=== Daftar Menu Kafe ===");
        for (String item : menu) {
            System.out.println("- " + item);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean found = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(cari)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("✅ " + cari + " tersedia di menu.");
        else
            System.out.println("❌ " + cari + " tidak ada di menu.");
    }
}
