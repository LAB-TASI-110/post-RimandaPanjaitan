package driver;

/**
 * 12S24049 - Rimanda Santa Risa Panjaitan
 */

import model.Model2;
import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah data
        System.out.print("Masukkan jumlah data: ");
        int N = input.nextInt();
        input.nextLine(); // buang newline

        // Array untuk simpan objek barang
        Model2[] gudang = new Model2[N];

        // Input data barang
        for (int i = 0; i < N; i++) {
            System.out.println("\nData ke-" + (i + 1));

            System.out.print("Masukkan stok: ");
            int stok = input.nextInt();
            input.nextLine();

            System.out.print("Masukkan kategori: ");
            String kategori = input.nextLine();

            gudang[i] = new Model2(stok, kategori);
        }

        // Input kategori yang ingin dicari
        System.out.print("\nMasukkan kategori yang ingin dihitung total stoknya: ");
        String cariKategori = input.nextLine();

        int totalStok = 0;

        // Proses penjumlahan
        for (int i = 0; i < N; i++) {
            if (gudang[i].getKategori().equalsIgnoreCase(cariKategori)) {
                totalStok += gudang[i].getStok();
            }
        }

        // Output hasil
        System.out.println("\nTotal stok untuk kategori '" + cariKategori + "' adalah: " + totalStok);

        input.close();
    }
}