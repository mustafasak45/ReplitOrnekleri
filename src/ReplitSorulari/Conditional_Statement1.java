package ReplitSorulari;

import java.util.Scanner;

public class Conditional_Statement1 {
    public static void main(String[] args) {
        //Girilen sayının pozitif, negatif veya sıfır olup olmadığını yazdırın Java Kodunu yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("Test data :");
        int value=scan.nextInt();
        System.out.println(value==0?"Sayi Sifir":value<0?"Sayi Negatif":"Sayi Pozitif");

    }
}
