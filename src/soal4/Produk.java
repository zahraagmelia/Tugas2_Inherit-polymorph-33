package soal4;

/**
 * Kelas dasar untuk seluruh jenis produk toko digital.
 */
public abstract class Produk {
    protected String kode;
    protected String nama;
    protected double hargaDasar;

    /**
     * Membuat produk dengan data dasar.
     *
     * @param kode kode unik produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @throws IllegalArgumentException jika nama kosong atau harga negatif
     */
    public Produk(String kode, String nama, double hargaDasar) {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong.");
        }

        if (hargaDasar < 0) {
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif.");
        }

        this.kode = kode;
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    /** @return harga akhir produk */
    public abstract double hitungHargaAkhir();

    /** @return deskripsi jenis produk */
    public abstract String deskripsi();

    /** @return kode produk */
    public String getKode() {
        return kode;
    }

    /** @return nama produk */
    public String getNama() {
        return nama;
    }
}