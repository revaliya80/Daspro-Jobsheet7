import java.util.Scanner;

public class Tugas2Parkir {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char jenis;
        int lama, total = 0;

        System.out.print("Masukkan jenis kendaraan (M/K): ");
        jenis = sc.next().charAt(0);

        System.out.print("Masukkan lama parkir (jam): ");
        lama = sc.nextInt();

        if (jenis == 'M' || jenis == 'm') {
            if (lama <= 1) {
                total = 3000;
            } else {
                total = 3000 + (lama - 1) * 1000;
            }
        } else if (jenis == 'K' || jenis == 'k') {
            if (lama <= 1) {
                total = 2000;
            } else {
                total = 2000 + (lama - 1) * 500;
            }
        } else {
            System.out.println("Jenis kendaraan tidak valid!");
            return; // keluar dari program
        }

        System.out.println("Total bayar: Rp " + total);
        sc.close();
    }
}