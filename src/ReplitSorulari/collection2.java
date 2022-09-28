package ReplitSorulari;

import java.util.ArrayList;

public class collection2 {
    public static void main(String[] args) {
        //Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.
        //Array List: siyah,mavi,kirmizi,beyaz
        //en başa: pembe
        //mavi-kirmizi arasına yesil renk eklenecek.
        ArrayList<String> list=new ArrayList<>();
        list.add("siyah");
        list.add("mavi");
        list.add("kirmizi");
        list.add("beyaz");

        list.add(0,"pembe");
        list.add(3,"yesil");

        System.out.println(list);



    }
}
