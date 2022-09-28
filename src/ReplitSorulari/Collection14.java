package ReplitSorulari;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection14 {
    public static void main(String[] args) {
        //Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.
        //TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi
        //```
        //Beklenen Çıktı:
        //```
        //```
        //Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
        //```
        //```
        //Tersten Siralanisi:
        //```
        //```
        //yesil
        //```
        //```
        //turuncu
        //```
        //```
        //sari
        //```
        //```
        //mavi
        //```
        //```
        //kirmizi
        //```
        TreeSet<String> treeSetim=new TreeSet<String>();
        treeSetim.add("yesil");
        treeSetim.add("sari");
        treeSetim.add("mavi");
        treeSetim.add("turuncu");
        treeSetim.add("kirmizi");

        System.out.println("Orjinal Treee sonucu: "+treeSetim);

        for (Iterator<String> it1 = treeSetim.iterator(); it1.hasNext(); ) {//iteratoru bastan sona foreach ile goturuyoruz
           it1.next();
        }
        for (Iterator<String> it2 = treeSetim.descendingIterator(); it2.hasNext(); ) {//burada sona gelen iterator descendingIterator() methoduyla basa donuyor
            System.out.println("Tersten Siralanisi: " + it2.next());
        }

    }
}
