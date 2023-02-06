package okul_proje;

public class Ogretmen {

   private String adSoyad;
    private int kimlikNo;
    private int yas;
    private String bolum;
    private int sicilNo;

    @Override
    public String toString() {
        return
                "\n AdSoyad =" + adSoyad +
                "\n kimlikNo =" + kimlikNo +
                "\n yas =" + yas +
                "\n bolum =" + bolum +
                "\n sicilNo =" + sicilNo ;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public Ogretmen() {
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(int kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }



    public Ogretmen(String adSoyad, int kimlikNo, int yas, String bolum, int sicilNo) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }


}
