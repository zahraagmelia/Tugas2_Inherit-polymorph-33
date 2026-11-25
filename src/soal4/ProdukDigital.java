package soal4;

/**
 * Merepresentasikan produk digital yang mendapatkan diskon khusus.
 */
public class ProdukDigital extends Produk {

    protected double ukuranMb;
    protected static final double DISKON_DIGITAL = 0.10;

    /**
     * Membuat produk digital.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @param ukuranMb ukuran file dalam MB
     */
    public ProdukDigital(String kode, String nama, double hargaDasar, double ukuranMb) {
        super(kode, nama, hargaDasar);
        this.ukuranMb = ukuranMb;
    }

    /**
     * Menghitung harga produk setelah diskon digital.
     *
     * @return harga setelah diskon 10 persen
     */
    @Override
    public double hitungHargaAkhir() {
        return hargaDasar * (1 - DISKON_DIGITAL);
    }

    /**
     * Menghasilkan deskripsi produk digital.
     *
     * @return deskripsi jenis dan ukuran produk
     */
    @Override
    public String deskripsi() {
        return "digital " + ukuranMb + " MB";
    }
}