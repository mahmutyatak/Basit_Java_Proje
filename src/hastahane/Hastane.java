package hastahane;

public class Hastane {
    private String adsoyad;
    private String tcNo;

    private String bolum;

    @Override
    public String toString() {
        return "\nadsoyad =" + adsoyad + '\'' +
                "\ntcNo =" + tcNo + '\'' +
                "\nbolum =" + bolum ;
    }

    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }



    public Hastane() {
    }

    public Hastane(String adsoyad, String tcNo, String bolum) {
        this.adsoyad = adsoyad;
        this.tcNo = tcNo;
        this.bolum = bolum;
    }
}
