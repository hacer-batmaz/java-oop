public class KrediKarti implements IOdeme {
    private String kartNo;

    public KrediKarti(String kartNo) {
        this.kartNo = kartNo;
    }

    @Override
    public void odemeYap() {
        System.out.println("Ödeme kredi kartı ile yapılıyor. Kart numarası: " + kartNo);
    }

    public String getKartNo() {
        return kartNo;
    }

    public void setKartNo(String kartNo) {
        this.kartNo = kartNo;
    }
}