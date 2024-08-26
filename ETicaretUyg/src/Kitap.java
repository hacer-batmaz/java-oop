public class Kitap extends Urun {
    private String yazar;
    public Kitap(int id, String isim, double fiyat, String yazar) {
        super(id, isim, fiyat);
        this.yazar = yazar;
    }

    @Override
    public void urunBilgisi() {
        System.out.println("Kitap ID: " + getId() + ", İsim: " + getIsim() + ", Fiyat: " + getFiyat() + ", Yazar: " + yazar);
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }
}