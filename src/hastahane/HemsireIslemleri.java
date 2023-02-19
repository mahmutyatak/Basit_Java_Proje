package hastahane;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HemsireIslemleri implements MethodOrtak{
Scanner scan=new Scanner(System.in);
static ArrayList<Hemsire> hemsireListesi=new ArrayList<>();
    void HemsireIslem(){
        System.out.println("============= HEMSİRE İŞLEMLER =============\n" +
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
               HemsireIslem();
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
                HemsireIslem();
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
        System.out.println("sigortanız var mı E/H");
        String secim=scan.nextLine();
        boolean sart=false;
        if (secim.equalsIgnoreCase("e")){
            sart=true;
        }
        Hemsire hemsire=new Hemsire(adSoyad,tcNo,bolum,sart);
        hemsireListesi.add(hemsire);
        System.out.println(hemsireListesi);
        HemsireIslem();


    }

    @Override
    public void arama() {
        scan.nextLine();
        System.out.println("aranacak hemsirenin tc nosunu giriniz");
        String tcno=scan.nextLine();
        boolean kontrol=true;
        for (Hemsire each:hemsireListesi
        ) {
            if (each.getTcNo().equalsIgnoreCase(tcno)){
                System.out.println(each);
                kontrol=false;
                HemsireIslem();
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
        System.out.println("silmek istediğiniz hemsirenin tc nosunu giriniz");
       String no=scan.nextLine();
        boolean kontrol=true;
        for (Hemsire each:hemsireListesi
        ) {
            if (each.getTcNo().equalsIgnoreCase(no)){
                System.out.println("silinecek HEMSİRE :"+each);
                hemsireListesi.remove(each);
                kontrol=false;
                HemsireIslem();
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
        System.out.println("sigortası olanlar");
        for (Hemsire each:hemsireListesi
             ) {
            if (each.isSigorta()){
                System.out.println(each);
            }
        }
        System.out.println("sigortasi olmayanlar");
        for (Hemsire each:hemsireListesi
             ) {
            if (!each.isSigorta()){
                System.out.println(each);
            }
        }
HemsireIslem();
    }
}
