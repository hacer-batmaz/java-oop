public abstract class Kullanici {
    private int id;
    private String isim;
    private String email;

    public Kullanici(int id, String isim, String email) {
        this.id = id;
        this.isim = isim;
        this.email = email;
    }

    public abstract void kullaniciBilgisi();

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}