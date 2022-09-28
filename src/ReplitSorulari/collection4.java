package ReplitSorulari;

import java.util.ArrayList;

public class collection4 {
    //Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.
    //
    //Array Elemanları: sari,yesil,mavi,pembe
    //
    //mavi rengini turuncu ile değiştirelim.
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("sari");
        list.add("yesil");
        list.add("mavi");
        list.add("pembe");

        list.remove("mavi");
        list.add(2,"turuncu");
        System.out.println(list);
    }
}
