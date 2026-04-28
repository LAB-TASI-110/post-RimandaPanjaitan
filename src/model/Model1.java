package model;

import java.util.*;

/**
 * 12S24049 - Rimanda Santa Risa Panjaitan
 */

public class Model1 {

    // ENUM Kota
    public enum Kota {
        MDN("Medan", "Dalam Pulau", 8000),
        BLG("Balige", "Dalam Pulau", 5000),
        JKT("Jakarta", "Luar Pulau", 12000),
        SBY("Surabaya", "Luar Pulau", 13000);

        private String nama;
        private String keterangan;
        private int harga;

        Kota(String nama, String keterangan, int harga) {
            this.nama = nama;
            this.keterangan = keterangan;
            this.harga = harga;
        }

        public String getNama() {
            return nama;
        }

        public String getKeterangan() {
            return keterangan;
        }

        public int getHarga() {
            return harga;
        }
    }

    // CLASS Pengiriman (logic utama)
    public static class Pengiriman {
        private Kota kota;
        private List<Double> daftarBerat;

        public Pengiriman(Kota kota) {
            this.kota = kota;
            this.daftarBerat = new ArrayList<>();
        }

        public void tambahBerat(double berat) {
            daftarBerat.add(berat);
        }

        public double getBeratButet() {
            return daftarBerat.size() > 0 ? daftarBerat.get(0) : 0;
        }

        public double getBeratUcok() {
            return daftarBerat.size() > 1 ? daftarBerat.get(1) : 0;
        }

        public double getTotalBerat() {
            double total = 0;
            for (double b : daftarBerat) {
                total += b;
            }
            return total;
        }

        public double getTotalOngkir() {
            double total = getTotalBerat() * kota.getHarga();

            if (getTotalBerat() > 10) {
                total *= 0.9; // diskon 10%
            }

            return total;
        }

        public String getPromo() {
            String promo = "";

            if (getTotalBerat() > 10) {
                promo += "Diskon 10% ";
            }

            if (kota.getKeterangan().equals("Luar Pulau")) {
                promo += "+ Asuransi Gratis";
            }

            if (promo.isEmpty()) {
                return "Tidak ada promo";
            }

            return promo;
        }

        public Kota getKota() {
            return kota;
        }
    }
}