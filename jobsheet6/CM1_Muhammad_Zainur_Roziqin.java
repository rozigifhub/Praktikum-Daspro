package jobsheet6;
import java.util.Scanner;

public class CM1_Muhammad_Zainur_Roziqin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM  : ");
        String nim = input.nextLine();

        // Mata kuliah 1
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        double uts1 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas1 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = input.nextDouble();

        // Mata kuliah 2
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        double uts2 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas2 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = input.nextDouble();

        // Mata kuliah 3
        System.out.println("\n--- Mata Kuliah 3: Matematika ---");
        System.out.print("Nilai UTS   : ");
        double uts3 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas3 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas3 = input.nextDouble();

        // Hitung nilai akhir tiap mata kuliah
        double rata1 = uts1 * 0.3 + uas1 * 0.4 + tugas1 * 0.3;
        double rata2 = uts2 * 0.3 + uas2 * 0.4 + tugas2 * 0.3;
        double rata3 = (uts3 + uas3 + tugas3) / 3;

        String huruf1 = "", huruf2 = "";
        String status1 = "", status2 = "";
        String huruf3 = "", status3 = "";

        // ================== Mata kuliah 1 ==================
        if (rata1 > 100 || rata1 < 0) {
            huruf1 = "CURANG/NILAI TIDAK VALID";
            status1 = "CURANG/NILAI TIDAK VALID";
        } else {
            if (rata1 > 80 && rata1 <= 100) {
                huruf1 = "A";
                status1 = "LULUS";
            } else {
                if (rata1 > 73 && rata1 <= 80) {
                    huruf1 = "B+";
                    status1 = "LULUS";
                } else {
                    if (rata1 > 65 && rata1 <= 73) {
                        huruf1 = "B";
                        status1 = "LULUS";
                    } else {
                        if (rata1 > 60 && rata1 <= 65) {
                            huruf1 = "C+";
                            status1 = "LULUS";
                        } else {
                            if (rata1 > 50 && rata1 <= 59) {
                                huruf1 = "C";
                                status1 = "TIDAK LULUS";
                            }else if (rata1 == 60){
                                huruf1 = "C";
                                status1 = "LULUS";
                            }else if (rata1 > 39 && rata1 <= 50) {
                                huruf1 = "D";
                                status1 = "TIDAK LULUS";
                            } else if (rata1 <= 39) { // ← ini else if terakhir
                                huruf1 = "E";
                                status1 = "TIDAK LULUS";
                            }
                        }
                    }
                }
            }
        }


        // ================== Mata kuliah 2 ==================
        if (rata2 > 100 || rata2 < 0) {
            huruf2 = "CURANG/NILAI TIDAK VALID";
            status2 = "CURANG/NILAI TIDAK VALID";
        } else {
            if (rata2 > 80 && rata2 <= 100) {
                huruf2 = "A";
                status2 = "LULUS";
            } else {
                if (rata2 > 73 && rata2 <= 80) {
                    huruf2 = "B+";
                    status2 = "LULUS";
                } else {
                    if (rata2 > 65 && rata2 <= 73) {
                        huruf2 = "B";
                        status2 = "LULUS";
                    } else {
                        if (rata2 > 60 && rata2 <= 65) {
                            huruf2 = "C+";
                            status2 = "LULUS";
                        } else {
                            if (rata2 > 50 && rata2 <= 59) {
                                huruf2 = "C";
                                status2 = "TIDAK LULUS";
                            }else if (rata2 == 60){
                                huruf2 = "C";
                                status2 = "LULUS";
                            } else if (rata2 > 39 && rata2 <= 50) {
                                huruf2 = "D";
                                status2 = "TIDAK LULUS";
                            } else if (rata2 <= 39) { // ← else if terakhir
                                huruf2 = "E";
                                status2 = "TIDAK LULUS";
                            }
                        }
                    }
                }
            }
        }

        // ================== Mata kuliah 3 ==================
        if (rata3 > 100 || rata3 < 0) {
            huruf3 = "CURANG/NILAI TIDAK VALID";
            status3 = "CURANG/NILAI TIDAK VALID";
        } else {
            if (rata3 > 80 && rata3 <= 100) {
                huruf3 = "A";
                status3 = "LULUS";
            } else {
                if (rata3 > 73 && rata3 <= 80) {
                    huruf3 = "B+";
                    status3 = "LULUS";
                } else {
                    if (rata3 > 65 && rata3 <= 73) {
                        huruf3 = "B";
                        status3 = "LULUS";
                    } else {
                        if (rata3 > 60 && rata3 <= 65) {
                            huruf3 = "C+";
                            status3 = "LULUS";
                        } else {
                            if (rata3 > 50 && rata3 <= 59) {
                                huruf3 = "C";
                                status3 = "TIDAK LULUS";
                            }else if (rata3 == 60){
                                huruf3 = "C";
                                status3 = "LULUS";
                            }else if (rata3 > 39 && rata3 <= 50) {
                                huruf3 = "D";
                                status3 = "TIDAK LULUS";
                            } else if (rata3 <= 39) { // ← ini else if terakhir
                                huruf3 = "E";
                                status3 = "TIDAK LULUS";
                            }
                        }
                    }
                }
            }
        }


        // Hitung rata-rata keseluruhan
        double rataTotal = (rata1 + rata2 + rata3) / 3;
        String statusSemester;

        if (rataTotal > 100 || rataTotal < 0) {
                statusSemester = "CURANG/NILAI TIDAK VALID";
            } else {
                if (rataTotal >= 70) {
                    if (status1.equals("LULUS")  && status2 == "LULUS" && status3 == "LULUS" ) {
                        statusSemester = "LULUS (Rata-Rata >= 70) dan LULUS KEDUA MATKUL";
                    } else {
                        statusSemester = "TIDAK LULUS (Salah satu matkul tidak lulus)";
                    }
                } else {
                    statusSemester = "TIDAK LULUS (Rata-Rata < 70)";
                }
            }



        // Output hasil
        System.out.println("\n===== HASIL PENILAIAN AKADEMIK =====");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);

        System.out.println("\nMata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n",
                uts1, uas1, tugas1, rata1, huruf1, status1);
        System.out.printf("Struktur Data\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n",
                uts2, uas2, tugas2, rata2, huruf2, status2);
        System.out.printf("Matematika\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n",
                uts3, uas3, tugas3, rata3, huruf3, status3);


        System.out.printf("\nRata-rata Nilai Akhir: %.2f\n", rataTotal);
        System.out.println("Status Semester : " + statusSemester);


        if (rata1 > rata2 && rata1 > rata3){
            System.err.println("Rata-rata yang terbesar adalah mata kuliah: Algoritma Pemrograman");
        }else if (rata2 > rata1 && rata2 > rata3){
            System.err.println("Rata-rata yang terbesar adalah mata kuliah: Struktur Data");
        }else if(rata3 > rata1 && rata3 > rata2){
            System.err.println("Rata-rata yang terbesar adalah mata kuliah: Matematika");
        }

        input.close();
    }
}
