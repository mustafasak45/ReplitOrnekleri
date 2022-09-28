package ReplitSorulari;

import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int []arr={12,15,43,23,56,76,78,90,77,43};
        int aranan=0;
        int sayac=0;
        System.out.println("Aranan deger:");
        aranan=scan.nextInt();
        for (int each:arr) {
            if (aranan==each){
                System.out.println(aranan+" sayisi arrayin "+ sayac +". elemani");
            }
            sayac++;
        }
    }
}
