public abstract class Kisi {
    private int id;
    private String isim;

    public Kisi(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }

    public abstract void kisiBilgisi();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}