package ReplitSorulari;

import java.util.LinkedList;
import java.util.ListIterator;

public class collection10 {
    public static void main(String[] args) {
//Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.
//LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu
//**hint:  Collections.swap();**
//```
//Beklene Çıktı:
//```
//```
//Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
//```
//```
//Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
//```
        LinkedList<String> renkler=new LinkedList<String>();
        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("beyaz");
        renkler.add("siyah");
        renkler.add("yesil");
        renkler.add("turuncu");
        System.out.println("Orjinal LinkedList: "+renkler);
        ListIterator<String> it1=renkler.listIterator();
        String ilkEleman="**"+it1.next()+"**";

        String doruncuEleman="";
        int sayac=0;
        while (it1.hasNext()) {

            if (sayac==2) {
                doruncuEleman="**"+it1.next()+"**";
            }
            sayac++;
            it1.next();

        }
        renkler.set(0,doruncuEleman);
        renkler.set(3,ilkEleman);

        System.out.println("Swap sonrası durum: "+renkler.toString());


    }
}
