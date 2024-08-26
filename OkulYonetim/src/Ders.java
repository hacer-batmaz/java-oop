public class Ders implements ICalisabilir {
    private String dersAdi;

    public Ders(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public void dersBilgisi() {
        System.out.println();
        System.out.println("Ders adı: " + dersAdi);
    }

    @Override
    public void calis() {
        System.out.println(dersAdi + " çalışılıyor.");
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }
}