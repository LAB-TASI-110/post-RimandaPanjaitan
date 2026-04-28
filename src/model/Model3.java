package model;

/**
 * 12S24049 - Rimanda Santa Risa Panjaitan
 */

public class Model3 {
    private String nama;
    private int harga;

    public Model3(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
}
