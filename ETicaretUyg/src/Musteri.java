public class Musteri extends Kullanici {
    private String adres;
    public Musteri(int id, String isim, String email, String adres) {
        super(id, isim, email);
        this.adres = adres;
    }

    @Override
    public void kullaniciBilgisi() {
        System.out.println("Müşteri ID: " + getId() + ", İsim: " + getIsim() + ", Email: " + getEmail() + ", Adres: " + adres);
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}