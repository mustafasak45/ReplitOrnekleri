package Yildiz_Koleji;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    static Map<String, String> ogretmenlerMap=new HashMap<>();
    static Scanner scan=new Scanner(System.in);

    public static void feykOgretmenEkle(){
        ogretmenlerMap.put("1234567890","Ali, Can, 1980, Matematik");
        ogretmenlerMap.put("1234578901","Veli, Cem, 1990, Fizik");
        ogretmenlerMap.put("1234582345","Mahmut, Sari, 2001, Turkce");
    }

    public static void ogretmenMenu() throws InterruptedException {
        String tercih;
        do{
            System.out.println("===================YILDIZ KOLEJI=================\r\n"
                    +"===================OGRETMEN MENU=================\r\n"
                    +"1-Ogretmen Listesi Yazdir\r\n"
                    +"2-Soyisimden Ogretmen Bulma\r\n"
                    +"3-Branstan Ogretmen Bulma\r\n"
                    +"4-Bilgilerini Girerek Ogretmen Ekleme\r\n"
                    +"5-Kimlik No Ile Kayit Silme\r\n"
                    +"A-ANA MENU\n"
                    +"Q-CIKIS"
                    );
            System.out.println("Islem tercihinizi giriniz :");
            tercih=scan.nextLine().toUpperCase();

            switch (tercih) {
                case "1":
                    ogretmenListesiYazdir();
                    break;
                case "2":
                    soyisimdenOgretmenBulma();
                    break;
                case "3":
                    branstanOgretmenBulma();
                    break;
                case "4":
                    ogretmenEkleme();
                    break;
                case "5":
                    break;
                case "A":
                    Depo.anaMenu();
                    break;
                case "Q":
                    Depo.projeDurdur();
                    break;
                default:
                    System.out.println("Hatali giris, tekrar girin :");


            }

        }while(!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    private static void ogretmenEkleme() {

        System.out.println("TC No girin");
        String tcNo=scan.next();  //burasi asagida olusturdugumuz Map'in key'i


        System.out.println("Isim girin");//burasi ve diger isim,soyisim,dYili,brans asagida olusturdugumuz Map'in valueleri'i
        String isim=scan.next();
        System.out.println("Soyisim girin");
        String soyisim=scan.next();
        System.out.println("Dogum yili girin");
        String dYili=scan.next();
        System.out.println("Brans girin");
        String brans=scan.next();

        String eklenecekValueler=isim+" "+soyisim+" "+dYili+" "+brans;

        ogretmenlerMap.put(tcNo, eklenecekValueler);

    }

    private static void branstanOgretmenBulma()

    {System.out.printf("Ogretmenin bransini giriniz :");
        String istenenbrans=scan.nextLine();

        Set<Map.Entry<String,String>> ogretmenEntrySet= ogretmenlerMap.entrySet();

        System.out.println("********BRANS ILE OGRETMEN BULMA*******");
        System.out.println("******************************************\n" +
                "TcNo    Isim   Soyisim    D.Yili   Brans");
        for (Map.Entry<String,String> each:ogretmenEntrySet) {

            String eachKey=each.getKey();
            String eachValue=each.getValue();

            String eachValuearr[]=eachValue.split(", ");
            if (istenenbrans.equalsIgnoreCase(eachValuearr[3])) {

                System.out.printf("%11s  %-6s  %-8s %4s %s \n", eachKey, eachValuearr[0], eachValuearr[1], eachValuearr[2], eachValuearr[3]);
            }


        }
        System.out.println("******************************************\n");

    }

    private static void soyisimdenOgretmenBulma() {
        System.out.printf("Ogretmenin soyismini giriniz :");
        String istenenSoyIsim=scan.nextLine();

        Set<Map.Entry<String,String>> ogretmenEntrySet= ogretmenlerMap.entrySet();

        System.out.println("********SOYISIM ILE OGRETMEN BULMA*******");
        System.out.println("******************************************\n" +
                "TcNo    Isim   Soyisim    D.Yili   Brans");
        for (Map.Entry<String,String> each:ogretmenEntrySet) {

            String eachKey=each.getKey();
            String eachValue=each.getValue();

            String eachValuearr[]=eachValue.split(", ");
            if (istenenSoyIsim.equalsIgnoreCase(eachValuearr[1])) {

                System.out.printf("%11s  %-6s  %-8s %4s %s \n", eachKey, eachValuearr[0], eachValuearr[1], eachValuearr[2], eachValuearr[3]);
            }

        }
        System.out.println("******************************************\n");

    }

    private static void ogretmenListesiYazdir() {
       Set<Map.Entry<String,String>> ogretmenEntrySet= ogretmenlerMap.entrySet();

        System.out.println("**************OGRETMEN BILGILERI**********");
        System.out.println("******************************************\n" +
                "TcNo    Isim   Soyisim    D.Yili   Brans");
        for (Map.Entry<String,String> each:ogretmenEntrySet) {

            String eachKey=each.getKey();
            String eachValue=each.getValue();

            String eachValuearr[]=eachValue.split(", ");

            System.out.printf("%11s  %-6s  %-8s %4s %s \n",eachKey,eachValuearr[0],eachValuearr[1],eachValuearr[2],eachValuearr[3]);

        }
        System.out.println("******************************************\n");
    }
}
