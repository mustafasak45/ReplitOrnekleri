package ReplitSorulari;

import java.util.LinkedList;
import java.util.ListIterator;

public class collection9 {
    public static void main(String[] args) {
        //Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.
        //
        //LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor
        //```
        //Beklenen Çıktı:
        //```
        //```
        //Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
        //```
        //```
        //LinkedList Tersi:
        //```
        //```
        //mor
        //```
        //```
        //beyaz
        //```
        //```
        //kirmizi
        //```
        //```
        //yesil
        //```
        //```
        //mavi
        //```
        //```
        //sari
        //```

        LinkedList<String> renkler=new LinkedList<>();
        renkler.add("mor");
        renkler.add("beyaz");
        renkler.add("kirmizi");
        renkler.add("yesil");
        renkler.add("mavi");
        renkler.add("sari");
        ListIterator<String> it1= renkler.listIterator();
        System.out.println("LinkedList Tersi:");
        it1.next();
        while (it1.hasNext()) {
            it1.next();
        }
        while (it1.hasPrevious()){
            System.out.println(it1.previous());
        }
    }
}
