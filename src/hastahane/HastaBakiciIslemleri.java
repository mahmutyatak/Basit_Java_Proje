package hastahane;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HastaBakiciIslemleri implements MethodOrtak {
Scanner scan=new Scanner(System.in);
static ArrayList<HastaBakici> hsatabkicilar=new ArrayList<>();
    void HastaBakiciIslem(){
        System.out.println("============= HASTA BAKICI İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");
        int secim=0;
        try {
            secim=scan.nextInt();

        }catch (InputMismatchException e){
            String deger=scan.nextLine();
            if (deger.equalsIgnoreCase("q")){
                AnaMenu obj1=new AnaMenu();
                obj1.islemler();
            }else {
                System.out.println("YAnlis secim");
                HastaBakiciIslem();
            }

        }
        switch (secim){
            case 1:{
                ekleme();
                break;
            }
            case 2:{
                arama();
                break;
            }
            case 3:{
                listeleme();
                break;
            }
            case 4:{
                silme();
                break;
            }
            default:
                System.out.println("yanlış secim");
                HastaBakiciIslem();
                break;
        }

    }




    @Override
    public void ekleme() {
        scan.nextLine();
        System.out.println("adınızı soyadınızı giriniz");
        String adSoyad=scan.nextLine();
        System.out.println("tc kimlikno giriniz");
        String tcNo=scan.nextLine();
        System.out.println("bolumunuzu giriniz");
        String bolum=scan.nextLine();
        System.out.println("ise baslama tarihini giriniz");
        int isBaslama=scan.nextInt();
        System.out.println("ogrenim durumnu giriniz");
        String ogrenimDurumu=scan.nextLine();
        HastaBakici hastaBakici=new HastaBakici(adSoyad,tcNo,bolum,ogrenimDurumu,isBaslama);
        hsatabkicilar.add(hastaBakici);
        System.out.println(hsatabkicilar);
        HastaBakiciIslem();

    }

    @Override
    public void arama() {
        scan.nextLine();
        System.out.println("aranacak hasta bakicinin tc nosunu giriniz");
        String tcno=scan.nextLine();
        boolean kontrol=true;
        for (HastaBakici each:hsatabkicilar
        ) {
            if (each.getTcNo().equalsIgnoreCase(tcno)){
                System.out.println(each);
                kontrol=false;
                HastaBakiciIslem();
            }
        }

        if (kontrol){
            System.out.println("aranan tc böyle birisi yok");
            arama();
        }
    }

    @Override
    public void silme() {
        scan.nextLine();
        System.out.println("silmek istediğiniz doktorun sicil nosunu giriniz");
        String no=scan.nextLine();
        boolean kontrol=true;
        for (HastaBakici each:hsatabkicilar
        ) {
            if (each.getTcNo().equalsIgnoreCase(no)){
                System.out.println("silinecek hasta bakici :"+each);
                hsatabkicilar.remove(each);
                kontrol=false;
                HastaBakiciIslem();
                break;
            }
        }
        if (kontrol){
            System.out.println("boyle bir TC no yok");
            silme();
        }

    }

    @Override
    public void listeleme() {
        for (HastaBakici each:hsatabkicilar
             ) {
            System.out.println(each);
        }

    }
}
