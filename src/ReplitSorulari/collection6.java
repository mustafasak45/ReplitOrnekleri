package ReplitSorulari;

import java.util.ArrayList;

public class collection6 {
    public static void main(String[] args) {
        //Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.
    //
    //LinkedList elemanları: sari,mavi,mor,yesil,beyaz

    ArrayList<String> list=new ArrayList<>();
    list.add("sari");
    list.add("mavi");
    list.add("mor");
    list.add("yesil");
    list.add("beyaz");
        for (String each:list) {
            System.out.println(each);
        }

    }
}
