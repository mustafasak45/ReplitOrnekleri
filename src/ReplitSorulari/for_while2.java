package ReplitSorulari;

import java.util.Scanner;

public class for_while2 {
    public static void main(String[] args) {
        //Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
        //Input :
        //30
        //40
        //Beklenen Cikti:
        //30 ve 40 icin GCD = 10
        //30 ve 40 icin LCM = 120
        Scanner scan=new Scanner(System.in);
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int ekok=1;
        int ebob=1;
        for (int i = 2; i <= sayi1 && i<=sayi2; i++) {
            if (sayi1%i==0&&sayi2%i==0){
                ebob=i;

            }
        }
        System.out.println(sayi1+" ve "+sayi2+" icin GCD ="+(sayi1*sayi2/ebob));
        System.out.println(sayi1+" ve "+sayi2+" icin LCM ="+ebob);

    }
}
