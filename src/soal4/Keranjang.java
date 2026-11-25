package soal4;

import java.util.ArrayList;

/**
 * Mengelola daftar produk dan perhitungan total belanja.
 */
public class Keranjang {

    private ArrayList<Produk> daftarProduk = new ArrayList<>();

    /**
     * Menambahkan produk ke keranjang.
     *
     * @param produk produk yang akan ditambahkan
     * @throws IllegalStateException jika kode produk sudah terdaftar
     */
    public void tambah(Produk produk) {
        for (Produk item : daftarProduk) {
            if (item.getKode().equals(produk.getKode())) {
                throw new IllegalStateException(
                    "Kode produk sudah ada di keranjang: " + produk.getKode()
                );
            }
        }

        daftarProduk.add(produk);
    }

    /**
     * Menghitung seluruh harga produk dalam keranjang.
     *
     * @return total harga belanja
     */
    public double hitungTotal() {
        double total = 0;

        for (Produk produk : daftarProduk) {
            total += produk.hitungHargaAkhir();
        }

        return total;
    }

    /**
     * Mencetak rincian produk dan total belanja.
     */
    public void cetakStruk() {
        for (Produk produk : daftarProduk) {
            System.out.printf(
                "%s | %s | %s | Rp%.0f%n",
                produk.getKode(),
                produk.getNama(),
                produk.deskripsi(),
                produk.hitungHargaAkhir()
            );
        }

        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    /**
     * Menghitung jumlah produk berdasarkan jenisnya.
     */
    public void hitungPerJenis() {
        int fisik = 0;
        int digital = 0;
        int langganan = 0;

        for (Produk produk : daftarProduk) {
            if (produk instanceof Langganan) {
                Langganan item = (Langganan) produk;
                langganan++;
            } else if (produk instanceof ProdukDigital) {
                ProdukDigital item = (ProdukDigital) produk;
                digital++;
            } else if (produk instanceof ProdukFisik) {
                ProdukFisik item = (ProdukFisik) produk;
                fisik++;
            }
        }

        System.out.printf(
            "Fisik: %d, Digital: %d, Langganan: %d%n",
            fisik, digital, langganan
        );
    }
}