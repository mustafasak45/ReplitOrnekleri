package ReplitSorulari;

public class array9 {
    public static void main(String[] args) {
        //Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
        //
        //Array: [1,2,3,4,5,6,7,8,9]
        //
        //Beklenen Çıktı:
        //Tek Sayilar: 5
        //Cift Sayilar: 4

        int arr[]={1,2,3,4,5,6,7,8,9};
        int cifler=0;
        int tekler=0;
        for (int each:arr) {
            if (each%2==0){
                cifler++;
            }else {tekler++;}

        }
        System.out.println("Tek Sayilar: "+tekler+"\n"+"Cift Sayilar: "+cifler);
    }
}
