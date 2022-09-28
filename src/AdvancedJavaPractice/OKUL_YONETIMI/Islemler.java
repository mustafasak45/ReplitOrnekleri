package AdvancedJavaPractice.OKUL_YONETIMI;

import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {

    static ArrayList< Kisi> ogrenciListesi=new ArrayList<>();//ekle() methodu icinde kullanacaksiniz
    static ArrayList< Kisi> ogretmenListesi=new ArrayList<>();//ekle() methodu icinde kullanacaksiniz
    static Scanner scan=new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli(){
        System.out.println("***********************\nOGRENCI VE OGRETMEN YONETIM PANELI\n***********************\n" +
                "1-OGRENCI ISLEMLERI\n2-OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.println("Isleminizi seciniz :");
        String secim=scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru="OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru="OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Hatali giris yaptiniz :(");
                girisPaneli();
                break;
        }

    }

    private static void cikis() {
        System.out.println("Gule Gule... Yine Beklerizzz");
    }

    public static void islemMenusu(){
        System.out.println("Sectiginiz kisi turu: "+kisiTuru+" icin asagidaki islemlerden tercih yapiniz.\r\n"
                +"===================ISLEMLER=================\r\n"
                +"1-EKLEME\r\n"
                +"2-ARAMA\r\n"
                +"3-LISTELEMEM\r\n"
                +"4-SILME\r\n"
                +"0-ANA MENU");
        System.out.println("Islem tercihinizi giriniz :");
        int secilenIslem=scan.nextInt();
        switch (secilenIslem){
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listele();
                islemMenusu();
                break;
            case 4:
                sil();
                islemMenusu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("adam gibi birsey girr");
                islemMenusu();
        }

    }

    private static void sil() {
        System.out.println("***    "+kisiTuru+"  Silme sayfasi ***");

        boolean flag=true;


        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            scan.nextLine();
            System.out.println();
            System.out.print("silinecek ogrenci kimlik no giriniz : ");

            String silinecekKimlikNo= scan.nextLine();

            for (Kisi k:ogrenciListesi) {
                if (k.getKimlikNo().equalsIgnoreCase(silinecekKimlikNo)) {
                    System.out.println("silinecek ogrenci : "+k.getAdSoyad());
                    ogrenciListesi.remove(k);//ogrenciyi sildi
                    flag=false;
                    break;
                }
            }if (flag){
                System.out.println("silinecek ogrenci mevcut degil ");
            }

        }else {//ogretmen aranıyor
            System.out.println("silinecek ogretmen kimlik no giriniz : ");
            String silinecekKimlikNo=scan.next();

            for (Kisi k:ogretmenListesi ) {
                if(k.getKimlikNo().equalsIgnoreCase(silinecekKimlikNo)){
                    System.out.println("silinecek ogretmen : "+k.getAdSoyad());
                    ogretmenListesi.remove(k);
                    flag=false;
                    break;
                }
            }if (flag){
                System.out.println("silinecek ogretmen mevcut degil");
            }
        }

    }

    private static void listele() {
        System.out.println("***    "+kisiTuru+"  Listeleme sayfasi ***");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            System.out.println(ogrenciListesi);
        }
        else {
            for (Kisi k:ogretmenListesi) {
                System.out.println(k.toString());

            }
        }
    }

    private static void arama() {

        System.out.println("***    "+kisiTuru+"  arama sayfasi ***");

        boolean flag=true;


        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            scan.nextLine();
            System.out.println();
            System.out.print("aradiginiz ogrenci kimlik no giriniz : ");

            String arananKimlikNo= scan.nextLine();

            for (Kisi k:ogrenciListesi) {
                if (k.getKimlikNo().equalsIgnoreCase(arananKimlikNo)) {
                    System.out.println("aradiginiz ogrenci : "+k.getAdSoyad());
                    flag=false;
                }
            }if (flag){
                System.out.println("aradiginiz ogrenci mevcut degil ");
            }

        }else {
            System.out.println("aradiginiz ogretmen kimlik no giriniz : ");
            String arananKimlikNo=scan.next();

            for (Kisi k:ogretmenListesi ) {
                if(k.getKimlikNo().equalsIgnoreCase(arananKimlikNo)){
                    System.out.println("aradiginiz ogretmen : "+k.getAdSoyad());
                    flag=false;
                }
            }if (flag){
                System.out.println("aradiginiz ogretmen mevcut degil");
            }
        }

    }
    private static void ekle() {
        System.out.println("***    "+kisiTuru+"  ekleme sayfasi ***");
        System.out.println("ad soyad giriniz :");
        String adSoyad=scan.nextLine();
        scan.nextLine();
        System.out.println("Kimlik no giriniz :");
        String kimlikNo= scan.nextLine();
        System.out.println("yas giriniz :");
        int yas=scan.nextInt();

        if (kisiTuru.equals("OGRENCI")){
            System.out.println("ogrenci no giriniz : ");
            String ogrenciNo=scan.nextLine();
            scan.nextLine();
            System.out.println("Sinif giriniz : ");
            String sinif=scan.nextLine();

            Ogrenci sefilOgrenci=new Ogrenci(adSoyad,kimlikNo,yas,ogrenciNo,sinif);
            ogrenciListesi.add(sefilOgrenci);

        }else {
            System.out.println("sicil no giriniz : ");
            String sicilNo= scan.nextLine();
            scan.nextLine();
            System.out.println("bolum giriniz : ");
            String bolum=scan.nextLine();
            Ogretmen muhtesemOgretmen=new Ogretmen(adSoyad,kimlikNo,yas,sicilNo,bolum);
            ogretmenListesi.add(muhtesemOgretmen);
        }
    }

}
