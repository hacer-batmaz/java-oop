public class Siparis {
    private int id;
    private Musteri musteri;
    private Urun urun;
    private IOdeme odeme;

    public Siparis(int id, Musteri musteri, Urun urun, IOdeme odeme) {
        this.id = id;
        this.musteri = musteri;
        this.urun = urun;
        this.odeme = odeme;
    }
    public void siparisBilgisi() {
        System.out.println("Sipariş ID: " + id);
        musteri.kullaniciBilgisi();
        urun.urunBilgisi();
        odeme.odemeYap();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public IOdeme getOdeme() {
        return odeme;
    }

    public void setOdeme(IOdeme odeme) {
        this.odeme = odeme;
    }
}