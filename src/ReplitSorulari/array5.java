package ReplitSorulari;

import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr={1551,1223,1443,1267,1789,1023,2020};
        System.out.println("Aranan Deger");
        int aranan=scan.nextInt();
        int kontrol=0;
        for (int each:arr) {
            if (each==aranan){
                kontrol++;
            }
        }
        if (kontrol>0){
            System.out.println("**True**");
        }else {
            System.out.println("**False**");
        }
    }

}
