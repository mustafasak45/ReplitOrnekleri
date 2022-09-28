package Yildiz_Koleji;

import java.util.Scanner;

public class Depo {
    static Scanner scan=new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {

        String tercih="";

        do{
        System.out.println("===================YILDIZ KOLEJI=================\r\n"
                +"===================ANA MENU=================\r\n"
                +"1-Okul Bilgileri Goruntule\r\n"
                +"2-Ogretmen Menu\r\n"
                +"3-Ogrenci Menu\r\n"
                +"Q-CIKIS");
        System.out.println("Islem tercihinizi giriniz :");

        tercih=scan.nextLine().toUpperCase();
        switch (tercih) {
            case "1"://okul bilgileri
                okulBilgileriniYazdir();
                break;
            case "2":
                Ogretmen.ogretmenMenu();
                break;
            case "3":
                break;
            case "Q":
                break;
            default:
                System.out.println("Lutfen gecerli bir tercih girin : ");
                Thread.sleep(1000);
        }

        }while (!tercih.equalsIgnoreCase("Q"));

        Depo.projeDurdur();
    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("===================YILDIZ KOLEJI=================\r\n"+
                "\t\t\t Adres : "+Okul.adres+
                "\n\t\t\t Telefon : "+Okul.telefon);
        Thread.sleep(2000);
    }
    public static void projeDurdur() {
        System.out.println("Okul Projesinden Ciktiniz...");
        System.exit(0);
    }
}
