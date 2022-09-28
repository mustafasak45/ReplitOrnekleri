package ReplitSorulari;

import java.util.Scanner;

public class for_while1 {
    public static void main(String[] args) {
        //Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        // ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
        //char ch1= 'a' ;
        //	String name =“John came late"
        //	Expected Output:
        //Number of a = 2

        Scanner scan=new Scanner(System.in);
        String cumle=scan.nextLine();
        String ch=scan.next();
        ch= String.valueOf(ch.charAt(0));
        int kontrol=0;
        //System.out.println(ch);
        for (int i = 0; i < cumle.length(); i++) {
            if (ch.equalsIgnoreCase(cumle.substring(i,i+1)))   {
                kontrol++;
            }
    }
        System.out.println("Number of "+ch+" = "+kontrol);
}
}
