public class BankaHesabi extends Musteri {
    private int hesapNo;
    private double bakiye;
    public BankaHesabi(Musteri musteri, int hesapNo, double bakiye) throws Exception {
        super(musteri.getIsim(), musteri.getSifre());
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
    }

    public BankaHesabi() {
        super();
    }

    public void hesapBilgi() {
        System.out.println("--------Müşteri İsmi: " + getIsim() + "--------");
        System.out.println("Hesap Numarası: " + hesapNo);
        System.out.println("Bakiye: " + bakiye + "\n");
    }

    public int getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}