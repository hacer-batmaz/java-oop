import java.util.Scanner;

public class Main {
    private static BankaHesabi hesap = new BankaHesabi();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Banka banka = new Banka();

        Musteri musteriler[] = {
                new Musteri("Joe","2587"),
                new Musteri("John","4238"),
                new Musteri("James","5130")
        };

        for (int i = 0; i < musteriler.length; i++) {
            banka.musteriEkle(musteriler[i]);
        }

        musteriler[0].sifreKontrol();
        hesap.setBakiye(100000);

        /*müşteri silme
        banka.musteriSil(musteriler[1]);
         */

        boolean devamEt = true;
        while (devamEt) {
            devamEt = islemler(); // Menüye gir ve devam etmek isteyip istemediğini döndür
        }

        System.out.println("Çıkış yapıldı.");
    }

    public static boolean islemler() {
        System.out.println("--------Yapmak istediğiniz işlemi seçiniz:");
        System.out.println("\t1. Bakiye Gör");
        System.out.println("\t2. Para Çekme");
        System.out.println("\t3. Para Yatırma");
        System.out.println("\t4. Çıkış");

        int islemNo = sc.nextInt();

        switch (islemNo) {
            case 1:
                System.out.println("Güncel Bakiyeniz: " + hesap.getBakiye());

                System.out.println("--------Başka bir işlem yapmak istiyor musunuz? (evet/hayır)");
                String mesaj = sc.next();

                if (mesaj.equalsIgnoreCase("evet"))
                    return true;
                else
                    return false;

            case 2:
                System.out.println("Çekmek istediğiniz miktarı giriniz.");

                double cekilenMiktar = sc.nextDouble();
                if (cekilenMiktar > hesap.getBakiye()) {
                    System.out.println("Yetersiz bakiye.");
                } else {
                    hesap.setBakiye(hesap.getBakiye() - cekilenMiktar);
                    System.out.println(cekilenMiktar + " TL çekildi. Hesapınızda kalan miktar: " + hesap.getBakiye());
                }

                System.out.println("--------Başka bir işlem yapmak istiyor musunuz? (evet/hayır)");
                String msj = sc.next();

                if (msj.equalsIgnoreCase("evet"))
                    return true;
                else
                    return false;
            case 3:
                System.out.println("Yatırmak istediğiniz miktarı giriniz:");
                double yatirilanMiktar = sc.nextDouble();

                hesap.setBakiye(hesap.getBakiye() + yatirilanMiktar);
                System.out.println("Para yatırıldı. Hesabınızdaki güncel miktar: " + hesap.getBakiye());

                System.out.println("--------Başka bir işlem yapmak istiyor musunuz? (evet/hayır)");
                String mesj = sc.next();

                if (mesj.equalsIgnoreCase("evet"))
                    return true;
                else
                    return false;
            case 4:
                return false;
            default:
                System.out.println("Geçersiz işlem numarası.");
                return true;
        }
    }
}