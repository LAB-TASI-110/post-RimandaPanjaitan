package model;

/**
 * 12S24049 - Rimanda Santa Risa Panjaitan
 */

public class Model2 {
    private int stok;
    private String kategori;

    // Constructor
    public Model2(int stok, String kategori) {
        this.stok = stok;
        this.kategori = kategori;
    }

    // Getter
    public int getStok() {
        return stok;
    }

    public String getKategori() {
        return kategori;
    }
}