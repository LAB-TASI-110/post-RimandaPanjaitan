package driver;

/**
 * 12S24049 - Rimanda Santa Risa Panjaitan
 */

import model.Model1;
import java.util.*;

public class Driver1 {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

            Model1.Kota kota = null;
            Model1.Pengiriman kirim = null;

            while (true) {
                String input = in.nextLine().toUpperCase();

                // stop condition
                if (input.equals("END") || input.equals("---")) {
                    break;
                }

                // input pertama = kota
                if (kota == null) {
                    try {
                        kota = Model1.Kota.valueOf(input);
                        kirim = new Model1.Pengiriman(kota);
                    } catch (Exception e) {
                        System.out.println("Kode kota tidak valid!");
                    }
                } else {
                    // input berikutnya = berat
                    try {
                        double berat = Double.parseDouble(input);
                        kirim.tambahBerat(berat);
                    } catch (Exception e) {
                        System.out.println("Input harus angka!");
                    }
                }
            }

            // ===== OUTPUT STRUK =====
            System.out.println("\n===== DEL EXPRESS =====");
            System.out.println("Kota Tujuan        : " + kirim.getKota().getNama());
            System.out.println("Berat Butet        : " + kirim.getBeratButet() + " kg");
            System.out.println("Berat Ucok         : " + kirim.getBeratUcok() + " kg");
            System.out.println("Total Berat        : " + kirim.getTotalBerat() + " kg");
            System.out.println("Total Ongkos Kirim : Rp " + kirim.getTotalOngkir());
            System.out.println("Promo              : " + kirim.getPromo());
            System.out.println("========================");
        }
    }
}