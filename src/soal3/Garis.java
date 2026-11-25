package soal3;

/**
 * Merepresentasikan garis yang dibentuk oleh dua objek Titik.
 */
public class Garis {
    private Titik awal;
    private Titik akhir;

    /**
     * Membuat garis dari dua titik dengan defensive copy.
     * @param awal titik awal garis
     * @param akhir titik akhir garis
     */
    public Garis(Titik awal, Titik akhir) {
        this.awal = new Titik(awal.getX(), awal.getY());
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Membuat garis berdasarkan koordinat kedua titik.
     * @param x1 koordinat x titik awal
     * @param y1 koordinat y titik awal
     * @param x2 koordinat x titik akhir
     * @param y2 koordinat y titik akhir
     */
    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2));
    }

    /** @return salinan titik awal garis */
    public Titik getAwal() {
        return new Titik(awal.getX(), awal.getY());
    }

    /** @return salinan titik akhir garis */
    public Titik getAkhir() {
        return new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Mengubah titik awal garis.
     * @param awal titik awal yang baru
     */
    public void setAwal(Titik awal) {
        this.awal = new Titik(awal.getX(), awal.getY());
    }

    /**
     * Mengubah titik akhir garis.
     * @param akhir titik akhir yang baru
     */
    public void setAkhir(Titik akhir) {
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /** @return panjang garis */
    public double getPanjang() {
        return awal.jarakKe(akhir);
    }

    /** @return representasi garis berdasarkan kedua titik */
    @Override
    public String toString() {
        return awal + " - " + akhir;
    }
}