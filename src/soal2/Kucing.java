package soal2;

public class Kucing extends Hewan {

    public Kucing(String nama) {
        super(nama);
        System.out.println("Kucing dibuat");
    }

    @Override
    public void suara() {
        System.out.println("meong");
    }

    public void panjat() {
        System.out.println(nama + " memanjat");
    }
}