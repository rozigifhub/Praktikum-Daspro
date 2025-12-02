// Muhammad Zainur Roziqin
// 1G
// 254107020081
// absen 23
package jobsheet10;

public class Kuis23Rozi {
    public static void main(String[] args) {
        int[][] penjualan23 = new int[5][3];
        int hargaReguler23 = 40000;
        int hargaPremium23 = 40000;
        //studio reguler
        penjualan23[0][0] = 12;
        penjualan23[0][1] = 18;
        penjualan23[0][2] = 12;
        //studio dolby
        penjualan23[1][0] = 9;
        penjualan23[1][1] = 11;
        penjualan23[1][2] = 10;
        //Imax
        penjualan23[2][0] = 8;
        penjualan23[2][1] = 12;
        penjualan23[2][2] = 15;
        //premier
        penjualan23[3][0] = 7;
        penjualan23[3][1] = 9;
        penjualan23[3][2] = 8;
        //suite
        penjualan23[4][0] = 5;
        penjualan23[4][1] = 7;
        penjualan23[4][2] = 6;

        //jawaban A
        int banyakTiketSenin23 = 0;
        int banyakTiketSabtu23 = 0;
        int banyakTiketMinggu23 = 0;
        for(int i = 0; i < penjualan23.length; i++){
            banyakTiketSenin23 += penjualan23[i][0];
            banyakTiketSabtu23 += penjualan23[i][1];
            banyakTiketMinggu23 += penjualan23[i][2];
        }
        int totalTiket23 = banyakTiketMinggu23 + banyakTiketSabtu23 + banyakTiketSenin23;

        System.out.println("Total tiket yang terjual: " + totalTiket23);

        // jawaban B
        int rata_rataMinggu23 = banyakTiketMinggu23 / 4;
        System.out.println("Rata-Rata tiket jumlah terjual hari minggu: " + rata_rataMinggu23);

        //jawaban C
        int pemasukanReguler23 = 0;
        int pemasukanPremium23 = 0;
        for(int i = 0; i < 2; i++){
            for( int j = 0; j < 3; j++){
                int p = penjualan23[i][j] * hargaReguler23;
                pemasukanReguler23 += p;
            }
        }

        for(int i = 2; i < 5; i++){
            for( int j = 0; j < 3; j++){
                int p = penjualan23[i][j] * hargaPremium23;
                pemasukanPremium23 += p;
            }
        }

        System.out.println("Total pemasukan bioskop selama 3 hari: " + (pemasukanPremium23 + pemasukanReguler23));

        //jawaban D
        String hariTerendah23;
        String StudioTerendah23 = "Luxury Suite";
        if(banyakTiketSenin23 < banyakTiketMinggu23 && banyakTiketSenin23 < banyakTiketSabtu23){
            hariTerendah23 = "Senin";
        }else if (banyakTiketMinggu23 < banyakTiketSenin23 && banyakTiketMinggu23 < banyakTiketSabtu23){
            hariTerendah23 = "Minggu";

        }else{
            hariTerendah23 = "Sabtu";
        }

        int banyakTiketReguler23 = 0;
        int banyakTiketDolby23 = 0;
        int banyakTiketIMAX23 = 0;
        int banyakTiketPremier23 = 0;
        int banyakTiketLuxury23 = 0;

        for (int i = 0; i < 3; i++){
            banyakTiketReguler23 += penjualan23[0][i];
        }
        for (int i = 0; i < 3; i++){
            banyakTiketDolby23 += penjualan23[1][i];
        }
        for (int i = 0; i < 3; i++){
            banyakTiketIMAX23 += penjualan23[2][i];
        }
        for (int i = 0; i < 3; i++){
            banyakTiketPremier23 += penjualan23[3][i];
        }
        for (int i = 0; i < 3; i++){
            banyakTiketLuxury23 += penjualan23[4][i];
        }

        if (banyakTiketLuxury23 < banyakTiketDolby23 && banyakTiketLuxury23 < banyakTiketReguler23 && banyakTiketLuxury23 < banyakTiketIMAX23 && banyakTiketLuxury23 < banyakTiketPremier23){
            System.out.println("Studio penjualan tiket terendah: " + StudioTerendah23);
        }
        System.out.println("Hari penjualan tiket terendah: " + hariTerendah23);

    }
}
