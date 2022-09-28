import java.util.Scanner;

public class for_tekrar {
    public static void main(String[] args) {
      /*
        while döngüsünü kullanarak Kullanıcı istediği kadar sayıyı toplamak istemektedir. Eğer girilen
        0 ise programdan çıkan ve toplam sonucu gösteren programı yazınız.
         */
        System.out.println("Sayı girin :");
        Scanner scan=new Scanner(System.in);
        int sayi =scan.nextInt();
        int toplam=0;

        while (sayi!=0){
            toplam+=sayi;
            System.out.println("Sayı girin :");
            sayi=scan.nextInt();
        }
        System.out.println(toplam);
    }
}
