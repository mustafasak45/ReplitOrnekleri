package ReplitSorulari;

import java.util.HashSet;
import java.util.TreeSet;

public class collection12 {
    public static void main(String[] args) {
//Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.
//
//HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi
//```
//Beklenen Çıktı:
//```
//```
//Tree Set Elemanlari:
//```
//```
//kirmizi
//```
//```
//mavi
//```
//```
//sari
//```
//```
//turuncu
//```
//```
//yesil
//```

        HashSet<String> hashListem=new HashSet<>();
        hashListem.add("sari");
        hashListem.add("mavi");
        hashListem.add("kirmizi");
        hashListem.add("yesil");
        hashListem.add("turuncu");

        TreeSet<String> treeSetim=new TreeSet<>(hashListem);
        System.out.println("TreeSet elements:");
        System.out.println("...");

        for (String renk:treeSetim) {
            System.out.println("...");
            System.out.println(renk);
            System.out.println("...");
        }



    }
}
