package ReplitSorulari;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class collection17 {
    public static void main(String[] args) {
        //Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tektek karşılaştırıp aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.
        //1. TreeSet: mavi,yesil,kirmizi,sari
        //2. TreeSet: yesil,mavi,pembe,turuncu
        //```
        //Beklenen Çıktı:
        //```
        //```
        //1. TreeSet: [kirmizi,mavi,sari,yesil]
        //```
        //```
        //2. TreeSet: [mavi,pembe,turuncu,yesil
        //```
        //```
        //Karsilastirma Sonucu:
        //```
        //```
        //no
        //```
        //```
        //yes
        //```
        //```
        //no
        //```
        //```
        //yes
        //```
        TreeSet<String> treeSet1=new TreeSet<>();
        TreeSet<String> treeSet2=new TreeSet<>();

        treeSet1.add("kirmizi");
        treeSet1.add("mavi");
        treeSet1.add("sari");
        treeSet1.add("yesil");

        treeSet2.add("mavi");
        treeSet2.add("pembe");
        treeSet2.add("turuncu");
        treeSet2.add("yesil");

        String control="no";

      for (String oute:treeSet1 ){
          for (String ine:treeSet2) {

              if (oute==ine){
                  control="yes";
                  System.out.println(control);
              }
          }
          if (control=="no"){

              System.out.println(control);
          }
          control="no";
      }

    }
}
