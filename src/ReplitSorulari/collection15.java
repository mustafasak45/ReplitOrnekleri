package ReplitSorulari;

import java.util.Iterator;
import java.util.TreeSet;

public class collection15 {
    public static void main(String[] args) {
//Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.
//TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe
//```
//Beklenen Çıktı:
//```
//```
//Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
//```
//```
//ilk elemen: kirmizi
//```
//```
//son eleman: yesil

        TreeSet<String> treeSetim=new TreeSet<>();
        treeSetim.add("sari");
        treeSetim.add("mavi");
        treeSetim.add("yesil");
        treeSetim.add("kirmizi");
        treeSetim.add("turuncu");
        treeSetim.add("pembe");
        Iterator<String> itr=treeSetim.iterator();
        System.out.println("Orjinal Tree: "+treeSetim);
        System.out.println("ilk elemen: " + itr.next());

        String sonEleman="";
        while (itr.hasNext()){
            sonEleman= itr.next();
        }
        System.out.println("son eleman: "+sonEleman);

    }
}
