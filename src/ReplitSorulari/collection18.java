package ReplitSorulari;

import java.util.PriorityQueue;

public class collection18 {
    public static void main(String[] args) {
        //Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.
        //priority queue elemanları: sari,yesil,mavi,kirmizi
        //```
        //Beklenen Çıktı:
        //```
        //```
        //Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]
        //```

        PriorityQueue<String> prq=new PriorityQueue<>();
        prq.add("sari");
        prq.add("yesil");
        prq.add("mavi");
        prq.add("kirmizi");
        System.out.println(prq);


    }
}
