package hastahane;

public class HastaBakici extends Hastane {

    String ogrenimDurumu;
    int baslamaTarihi;

    public HastaBakici(String adsoyad, String tcNo, String bolum, String ogrenimDurumu, int baslamaTarihi) {
        super(adsoyad, tcNo, bolum);
        this.ogrenimDurumu = ogrenimDurumu;
        this.baslamaTarihi = baslamaTarihi;
    }

    public HastaBakici() {
    }

    public String getOgrenimDurumu() {
        return ogrenimDurumu;
    }

    public void setOgrenimDurumu(String ogrenimDurumu) {
        this.ogrenimDurumu = ogrenimDurumu;
    }

    public int getBaslamaTarihi() {
        return baslamaTarihi;
    }

    public void setBaslamaTarihi(int baslamaTarihi) {
        this.baslamaTarihi = baslamaTarihi;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nogrenimDurumu='" + ogrenimDurumu +
                "\nbaslamaTarihi=" + baslamaTarihi;
    }
}
