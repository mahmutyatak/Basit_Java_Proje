package plaka_projesi;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static ArrayList<Kayit> liste=new ArrayList<>();
    Scanner scan=new Scanner(System.in);
    void plaka(){
        Kayit arac1=new Kayit("15lf200","ali veli","toyota",2000);
        liste.add(arac1);
        Kayit arac2=new Kayit("16lf200","ali vel","toyot",2001);
        liste.add(arac2);
        Kayit arac3=new Kayit("18lf200","ali ve","toyo",2002);
        liste.add(arac3);
        Kayit arac4=new Kayit("19lf200","ali ve","toyota",2005);
        liste.add(arac4);
    }


    void islemler(){

        plaka();

        System.out.println("----ISLEMLER--------");
        System.out.println("Yapmak istediginiz islemi giriniz\n1-Ekleme\n2-SORGULA\n3-Listeleme\n0-Cikis");
        int islem=scan.nextInt();

        switch (islem){

            case 1:{
                ekleme();
            }
            case 2:{
               sorgula();
            }case 3:{
                listeleme();
            }
            case 0:{
                System.out.println("iyi yolculuklar");
                break;
            }
            default:
                System.out.println("hatalı plaka");
                islemler();


        }




    }

    private void listeleme() {
        for (Kayit each:liste
             ) {
            System.out.println(each);
        }
        islemler();
    }

    private void sorgula() {
        scan.nextLine();
        System.out.println("sorgulamak istediğiniz calıntı aracın plakasını giriniz");
        String plaka=scan.nextLine().replaceAll(" ","");
        for (Kayit each:liste
             ) {
            if (each.plaka.equalsIgnoreCase(plaka)){
                System.out.println("calıntı :"+each);
            }
        }
        islemler();
    }

    private void ekleme() {
        scan.nextLine();
        System.out.println("eklemek istediginiz plakayı giriniz");
        String plaka=scan.nextLine().replaceAll(" ","");
        System.out.println("isim soyisim");
        String adsoyad=scan.nextLine();
        System.out.println("arac markasi");
        String marka=scan.nextLine();
        System.out.println("arac yili");
        int yas=scan.nextInt();
        Kayit arac=new Kayit(plaka,adsoyad,marka,yas);
        liste.add(arac);
        System.out.println(liste);
        islemler();

    }
}
