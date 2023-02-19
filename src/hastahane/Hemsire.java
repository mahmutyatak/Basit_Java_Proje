package hastahane;

public class Hemsire extends Hastane {
   private boolean sigorta;

    public Hemsire(String adsoyad, String tcNo, String bolum, boolean sigorta) {
        super(adsoyad, tcNo, bolum);
        this.sigorta = sigorta;
    }

    public Hemsire() {
    }

    public boolean isSigorta() {
        return sigorta;
    }

    public void setSigorta(boolean sigorta) {
        this.sigorta = sigorta;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nsigorta=" + sigorta;
    }
}
