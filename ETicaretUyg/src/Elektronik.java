public class Elektronik extends Urun {
    private String marka;
    public Elektronik(int id, String isim, double fiyat, String marka) {
        super(id, isim, fiyat);
        this.marka = marka;
    }

    @Override
    public void urunBilgisi() {
        System.out.println("Elektronik ID: " + getId() + ", İsim: " + getIsim() + ", Fiyat: " + getFiyat() + ", Marka: " + marka);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}