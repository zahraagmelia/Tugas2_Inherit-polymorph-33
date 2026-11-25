package soal4;

/**
 * Merepresentasikan produk langganan digital berdasarkan durasi bulan.
 */
public class Langganan extends ProdukDigital {

    private int durasiBulan;
    private static final int BATAS_DISKON_BULAN = 12;
    private static final double DISKON_LANGGANAN = 0.20;

    /**
     * Membuat produk langganan.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar per bulan
     * @param ukuranMb ukuran produk dalam MB
     * @param durasiBulan durasi langganan
     */
    public Langganan(String kode, String nama, double hargaDasar,
                     double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);
        this.durasiBulan = durasiBulan;
    }

    /**
     * Menghitung harga langganan berdasarkan durasi dan diskon.
     *
     * @return harga akhir langganan
     */
    @Override
    public double hitungHargaAkhir() {
        double total = hargaDasar * durasiBulan;

        if (durasiBulan >= BATAS_DISKON_BULAN) {
            total *= (1 - DISKON_LANGGANAN);
        }

        return total;
    }

    /**
     * Menghasilkan deskripsi produk langganan.
     *
     * @return deskripsi jenis dan durasi langganan
     */
    @Override
    public String deskripsi() {
        return "langganan " + durasiBulan + " bulan";
    }
}