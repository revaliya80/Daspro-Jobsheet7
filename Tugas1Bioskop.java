import java.util.Scanner;

public class Tugas1Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        double total, diskon = 0;

        System.out.print("Masukkan jumlah tiket: ");
        int jumlah = sc.nextInt();

        if (jumlah > 10) {
            diskon = 0.15;
        } else if (jumlah > 4) {
            diskon = 0.10;
        }

        total = jumlah * hargaTiket * (1 - diskon);

        System.out.println("\n=== Rincian Pembelian ===");
        System.out.println("jumlah tiket : " + jumlah);
        System.out.println("Harga tiket : Rp" + hargaTiket);
        System.out.println("Diskon :" + (diskon * 100) + "%");
        System.out.println("Total bayar : Rp " + total);
        sc.close();
    }
}
