public class Musteri {
    private String isim;
    private String sifre;

    public Musteri(String isim, String sifre) throws Exception {
        this.isim = isim;
        this.sifre = sifre;
    }

    public Musteri() {}

    public void sifreKontrol() throws Exception {
        if (sifre.length() != 4) {
            throw new Exception("Hata: Şifre karakter sayısı 4 olmalı!");
        }

        if (!sifre.matches("\\d{4}")) { //şifrenin 4 rakamdan oluşup oluşmadığını kontrol eder
            throw new Exception("Hata: Şifre sadece rakamlardan oluşmalı!");
        }

        System.out.println("Şifre geçerli. Giriş yapıldı.");
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "isim='" + isim + '\'' +
                ", sifre='" + sifre + '\'' +
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre){
        this.sifre = sifre;
    }
}