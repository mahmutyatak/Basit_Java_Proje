package hastahane;

public class Doktor extends Hastane {
   private int sicilNo;
    private int maas;

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public Doktor(String adsoyad, String tcNo, String bolum, int sicilNo, int maas) {
        super(adsoyad, tcNo, bolum);
        this.sicilNo = sicilNo;
        this.maas = maas;

    }

    @Override
    public String toString() {
        return super.toString()+
                "\nsicilNo =" + sicilNo +
                "\n maas =" + maas;

    }

    public Doktor() {
    }
}
