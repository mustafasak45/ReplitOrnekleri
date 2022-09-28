package ReplitSorulari;

import java.util.ArrayList;

public class collection1 {
    public static void main(String[] args) {
        //Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.
        //
        //Array elemanları: siyah,sari,mavi,turuncu

        ArrayList<String> list=new ArrayList<>();
        list.add("siyah");
        list.add("sari");
        list.add("mavi");
        list.add("turuncu");
        for (String each:list) {
            System.out.println(each);
        }
    }
}
