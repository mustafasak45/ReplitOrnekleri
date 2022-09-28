package ReplitSorulari;

import java.util.HashSet;
import java.util.TreeSet;

public class collection11 {
    public static void main(String[] args) {
        //HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.
        //HashSet List: sari,mavi,kirmizi,yesil,mor
        //```
        //Beklenen Çıktı:
        //```
        //```
        //TreeSet elements:
        //```
        //```
        //kirmizi
        //```
        //```
        //mavi
        //```
        //```
        //mor
        //```
        //```
        //sari
        //```
        //```
        //yesil
        //```

        HashSet<String> hashListem=new HashSet<>();
        hashListem.add("sari");
        hashListem.add("mavi");
        hashListem.add("kirmizi");
        hashListem.add("yesil");
        hashListem.add("mor");

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
