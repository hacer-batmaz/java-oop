public class Main {
    public static void main(String[] args) {
        Urun u1 = new Elektronik(001,"PC",25000,"Asus");
        Urun u2 = new Kitap(101,"Olağanüstü Bir Gece",55,"Stefan Zweig");

        Musteri k1 = new Musteri(2024001,"John","john@gmail.com","42 Rue de Rivoli, 75004 Paris, France");
        Satici k2 = new Satici(2021005,"Joe","joe@gmail.com","Acme Corporation");

        KrediKarti krediKarti = new KrediKarti("1234-5678-9876-5432");

        Siparis siparis = new Siparis(1,k1,u1,krediKarti);

        siparis.siparisBilgisi();
    }
}