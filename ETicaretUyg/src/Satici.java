public class Satici extends Kullanici {
    private String firmaAdi;
    public Satici(int id, String isim, String email, String firmaAdi) {
        super(id, isim, email);
        this.firmaAdi = firmaAdi;
    }

    @Override
    public void kullaniciBilgisi() {
        System.out.println("Satıcı ID: " + getId() + ", İsim: " + getIsim() + ", Email: " + getEmail() + ", Firma Adı: " + firmaAdi);
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }
}