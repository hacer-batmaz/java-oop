import java.util.ArrayList;
import java.util.List;

public class Banka {
    private List<Musteri> musteriler;

    public Banka() {
        musteriler = new ArrayList<>();
    }

    public void musteriEkle(Musteri musteri) {
        musteriler.add(musteri);
    }

    public void musteriSil(Musteri musteri) {
        musteriler.remove(musteri);
    }

    @Override
    public String toString() {
        return "Banka{" +
                "musteriler=" + musteriler +
                '}';

    }
}