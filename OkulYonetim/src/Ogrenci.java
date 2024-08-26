public class Ogrenci extends Kisi {
    private String bolum;
    public Ogrenci(int id, String isim, String bolum) {
        super(id, isim);
        this.bolum = bolum;
    }

    @Override
    public void kisiBilgisi() {
        System.out.println("------- Kişi Bilgisi -------");
        System.out.println("isim: " + getIsim() + " , id: " + getId() + " , bölüm: " + bolum);
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
}