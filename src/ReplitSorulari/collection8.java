package ReplitSorulari;

import java.util.LinkedList;
import java.util.ListIterator;

public class collection8 {
    public static void main(String[] args) {
        //Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım
        //LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz
        //```
        //Beklenen Çıktı:
        //```
        //```
        //Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
        //```
        //```
        //Listenin ilk elemani: sari
        //```
        //```
        //listenin son elemani: beyaz
        //```

        LinkedList<String> renkler=new LinkedList<>();
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("turuncu");
        renkler.add("siyah");
        renkler.add("yesil");
        renkler.add("beyaz");

        ListIterator<String> lit1= renkler.listIterator();
        System.out.println("Orjinal list elemanlari: "+renkler);

        System.out.println("Listenin ilk elemani: "+lit1.next());

       do {
           lit1.next();
           if (lit1.hasNext()==false){
               lit1.previous();
               System.out.println("listenin son elemani: " + lit1.next());
           }
       }while (lit1.hasNext());





    }
}
