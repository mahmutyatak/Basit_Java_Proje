package hastahane;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DoktorIslemleri implements MethodOrtak{

    Scanner scan=new Scanner(System.in);
   static ArrayList<Doktor> doktorlarLsitesi=new ArrayList<>();
    void doktorIslem(){
        System.out.println("============= DOKTOR İŞLEMLER =============\n" +
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
                doktorIslem();
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
                doktorIslem();
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
        System.out.println("sicil no giriniz");
        int sicil=scan.nextInt();
        System.out.println("maasınızı giriniz");
        int maas=scan.nextInt();
        Doktor doktor=new Doktor(adSoyad,tcNo,bolum,sicil,maas);
        doktorlarLsitesi.add(doktor);
        System.out.println(doktorlarLsitesi);
        doktorIslem();

    }

    @Override
    public void arama() {
        scan.nextLine();
        System.out.println("aranacak doktorun tc nosunu giriniz");
        String tcno=scan.nextLine();
        boolean kontrol=true;
        for (Doktor each:doktorlarLsitesi
             ) {
            if (each.getTcNo().equalsIgnoreCase(tcno)){
                System.out.println(each);
                kontrol=false;
                doktorIslem();
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
        int no=scan.nextInt();
        boolean kontrol=true;
        for (Doktor each:doktorlarLsitesi
             ) {
            if (each.getSicilNo()==no){
                System.out.println("silinecek doktor :"+each);
                doktorlarLsitesi.remove(each);
                kontrol=false;
                doktorIslem();
                break;
            }
        }
        if (kontrol){
            System.out.println("boyle bir sicil no yok");
            silme();
        }

}


    @Override
    public void listeleme() {
        for (Doktor each:doktorlarLsitesi
             ) {
            System.out.println(each);
        }
doktorIslem();
    }
}
