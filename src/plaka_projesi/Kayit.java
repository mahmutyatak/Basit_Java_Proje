package plaka_projesi;

public class Kayit {
    String plaka="";
    String adSoyad="";
    String aracMarkasi="";
    int yas=0;

    public Kayit() {
    }

    public Kayit(String plaka, String adSoyad, String aracMarkasi, int yas) {
        this.plaka = plaka;
        this.adSoyad = adSoyad;
        this.aracMarkasi = aracMarkasi;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return
                "\nplaka :" + plaka +
                "\nadSoyad :" + adSoyad +
                "\naracMarkasi :" + aracMarkasi +
                "\nyas :" + yas ;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getAracMarkasi() {
        return aracMarkasi;
    }

    public void setAracMarkasi(String aracMarkasi) {
        this.aracMarkasi = aracMarkasi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
