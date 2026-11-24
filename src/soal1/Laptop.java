package soal1;
/**
 * Merepresentasikan laptop sebagai perangkat elektronik.
 * Kelas ini mewarisi atribut dan method dari Perangkat.
 */
public class Laptop extends Perangkat {

    private int ramGb;
    private double ukuranLayarInci;

    /**
     * Membuat objek laptop.
     *
     * @param merek merek laptop
     * @param harga harga laptop
     * @param garansiBulan masa garansi dalam bulan
     * @param ramGb kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     */
    public Laptop(String merek, double harga, int garansiBulan,
                  int ramGb, double ukuranLayarInci) {

        super(merek, harga, garansiBulan);

        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
     * Menghitung harga laptop setelah diskon.
     *
     * @param diskonPersen persentase diskon
     * @return harga laptop setelah diskon
     */
    public double hitungHargaPromo(double diskonPersen) {
        return harga - (harga * diskonPersen / 100);
    }

    /**
     * Menghasilkan informasi singkat laptop.
     *
     * @return informasi merek, garansi, RAM, dan ukuran layar
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat()
                + " | RAM " + ramGb + " GB"
                + " | layar " + ukuranLayarInci + " inci";
    }
}
