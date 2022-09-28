package AdvancedJavaPractice;

public class Faktoriyel {

    public static void main(String[] args) {
        int sayi1=5;
        System.out.println(faktoriyel(sayi1));
    }

    private static int faktoriyel(int sayi1) {
        if (sayi1<=0)return 1;
        return sayi1*faktoriyel(sayi1-1);
    }


}
