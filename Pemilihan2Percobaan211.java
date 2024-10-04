import java.util.Scanner;

public class Pemilihan2Percobaan211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan_menu;
        String member;
        double harga = 0, diskon = 0, total_bayar;

        System.out.println("-------------------------------");
        System.out.println("======== MENU KAFE JTI ========");
        System.out.println("-------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");

        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = sc.nextInt();
        sc.nextLine();

        System.out.print("Apakah punya member (y/n) ? = ");
        member = sc.nextLine();
        System.out.println("--------------------------------------");

        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl = " + harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Paket Bunding = " + harga);
        } else {
            System.out.println("Pilihan menu tidak valid.");
            return;
        }

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Anda mendapatkan diskon 10%");
        }
        total_bayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + total_bayar);
        System.out.println("-------------------------------------");
    }
}
