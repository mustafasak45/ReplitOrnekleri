package ReplitSorulari;

import java.util.TreeSet;

public class collection13 {
    public static void main(String[] args) {
//Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.
//TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah
//```
//Beklenen Çıktı:
//```
//```
//beyaz
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
//siyah
//```
//```
//yesil
//```
        TreeSet<String> treeSetim=new TreeSet<String>();
        treeSetim.add("yesil");
        treeSetim.add("mavi");
        treeSetim.add("kirmizi");
        treeSetim.add("sari");
        treeSetim.add("beyaz");
        treeSetim.add("siyah");
        System.out.println("```");

        for (String e:treeSetim) {
            System.out.println("```");
            System.out.println(e);
            System.out.println("```");


        }


    }
}
