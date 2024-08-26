public class Sinav {
    private Ders ders;
    private String tarih;

    public Sinav(Ders ders, String tarih) {
        this.ders = ders;
        this.tarih = tarih;
    }

    public void sinavBilgisi() {
        System.out.println();
        System.out.println("Sınavı olacak ders: " + ders.getDersAdi());
        System.out.println(ders.getDersAdi() + " dersinin sınav tarihi: " + tarih);
    }

    public Ders getDers() {
        return ders;
    }

    public void setDers(Ders ders) {
        this.ders = ders;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
}