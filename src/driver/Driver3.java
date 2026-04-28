package driver;

/**
 * 12S24049 - Rimanda Santa Risa Panjaitan
 */

import model.Model3;
import java.util.*;

public class Driver3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar menu
        Map<String, Model3> menu = new LinkedHashMap<>();

        menu.put("bakwan", new Model3("Bakwan", 10000));
        menu.put("burger", new Model3("Burger", 10000));
        menu.put("kentang goreng", new Model3("Kentang Goreng", 15000));
        menu.put("nugget", new Model3("Nugget", 15000));
        menu.put("sosis", new Model3("Sosis", 15000));
        menu.put("roti isi ayam", new Model3("Roti Isi Ayam", 15000));
        menu.put("kopi", new Model3("Kopi", 8000));

        List<Model3> pesanan = new ArrayList<>();

        System.out.println("=== Input Pesanan ===");
        System.out.println("Ketik nama menu (ketik '---' untuk selesai)");

        while (true) {
            System.out.print("Masukkan pesanan: ");
            String pilih = input.nextLine().toLowerCase().trim();

            if (pilih.equals("---")) {
                break;
            }

            if (menu.containsKey(pilih)) {
                pesanan.add(menu.get(pilih));
            } else {
                System.out.println("Menu tidak tersedia!");
            }
        }

        // OUTPUT
        System.out.println("\n==============================");
        System.out.println("      Cafeteria IT Del");
        System.out.println("==============================");

        int total = 0;

        for (Model3 item : pesanan) {
            System.out.printf("%-20s Rp %,8d\n", item.getNama(), item.getHarga());
            total += item.getHarga();
        }

        System.out.println("------------------------------");
        System.out.printf("%-20s Rp %,8d\n", "Total", total);

        input.close();
    }
}