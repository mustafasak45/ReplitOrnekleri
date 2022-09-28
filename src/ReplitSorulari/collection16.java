package ReplitSorulari;

import java.util.TreeSet;

public class collection16 {
    public static void main(String[] args) {
        //Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.
        //TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe
        //```
        //Beklenen Çıktı:
        //```
        //```
        //Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
        //```
        //```
        //Tree eleman sayısı: 5
        //```
        TreeSet<String> treeSetim=new TreeSet<>();
        treeSetim.add("yesil");
        treeSetim.add("sari");
        treeSetim.add("mavi");
        treeSetim.add("kirmizi");
        treeSetim.add("pembe");
        System.out.println("Orjinal TreeSet: "+treeSetim);
        System.out.println("Tree eleman sayısı: "+treeSetim.size());
    }
}
