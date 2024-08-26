public class Ogretmen extends Personel {
    private String ders;
    public Ogretmen(int id, String isim, String departman , String ders) {
        super(id, isim, departman);
        this.ders = ders;
    }

    @Override
    public void kisiBilgisi() {
        System.out.println("------- Kişi Bilgisi -------");
        System.out.println("Öğretmen id: " + getId() + ", Öğretmen isim: " + getIsim() + ", Departman: " +
                getDedpartman() + ", Branş: " + ders);
    }

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }
}