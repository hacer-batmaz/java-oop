public abstract class Personel extends Kisi {
    private String departman;

    public Personel(int id, String isim, String departman) {
        super(id, isim);
        this.departman = departman;
    }

    @Override
    public void kisiBilgisi() {
        System.out.println("------- Kişi Bilgisi -------");
        System.out.println("isim: " + getIsim() + " , id: " + getId() + " , departman: " + departman);
    }

    public String getDedpartman() {
        return departman;
    }

    public void setDedpartman(String dedpartman) {
        this.departman = dedpartman;
    }
}
