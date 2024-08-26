public class Main {
    public static void main(String[] args) {
        Kisi ogrenci = new Ogrenci(101001,"Joe","Bilgisayar Mühendisliği");
        Kisi ogrenci2 = new Ogrenci(111001,"John","Elektrik Mühendisliği");

        Kisi ogretmen = new Ogretmen(202001,"Alex","Mühendislik Fakültesi","Lineer Cebir");
        Kisi ogretmen2 = new Ogretmen(202002,"Olivia","Mühendislik Fakültesi","Veri Yapıları");

        Ders ders = new Ders("Lineer Cebir");
        Ders ders2 = new Ders("Veri Yapıları");

        Sinav s1 = new Sinav(ders,"01/05/2025");
        Sinav s2 = new Sinav(ders2,"03/05/2025");

        ogrenci.kisiBilgisi();
        ogrenci2.kisiBilgisi();

        ogretmen.kisiBilgisi();
        ogretmen2.kisiBilgisi();

        ders.dersBilgisi();
        ders2.dersBilgisi();

        s1.sinavBilgisi();
        s2.sinavBilgisi();
    }
}